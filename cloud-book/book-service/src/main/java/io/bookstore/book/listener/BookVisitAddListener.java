package io.bookstore.book.listener;

import com.rabbitmq.client.Channel;
import io.bookstore.book.service.BookService;
import io.bookstore.common.cache.CacheKey;
import io.bookstore.common.cache.CacheService;
import io.bookstore.common.utils.Constants;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class BookVisitAddListener {
    private final BookService bookService;

    private final CacheService cacheService;

    private final RedissonClient redissonClient;

    @SneakyThrows
    @RabbitListener(queues = "UPDATE-DB-QUEUE")
    public void updateDb(Long bookId, Channel channel, Message message) {
        log.debug("收到更新数据库消息：" + bookId);
        RLock lock = redissonClient.getLock("addVisitCountToDb");
        lock.lock();
        try {
            Integer visitCount = (Integer) cacheService.getObject(CacheKey.BOOK_ADD_VISIT_COUNT + bookId);
            if (visitCount == null) {
                visitCount = 0;
            }
            cacheService.setObject(CacheKey.BOOK_ADD_VISIT_COUNT + bookId, ++visitCount);
            if (visitCount >= Constants.ADD_MAX_VISIT_COUNT) {
                bookService.addVisitCount(bookId, visitCount);
                cacheService.del(CacheKey.BOOK_ADD_VISIT_COUNT + bookId);
            }
        } catch (Exception e) {
            log.error("更新数据库失败" + bookId);
        }

        lock.unlock();

        Thread.sleep(1000 * 2);
    }

}
