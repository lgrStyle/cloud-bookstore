package io.bookstore.user.feign;

import io.bookstore.book.api.BookApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("book-service")
public interface BookFeignClient extends BookApi {
}
