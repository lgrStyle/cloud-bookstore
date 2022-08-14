package io.bookstore.book.feign;

import io.bookstore.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author liguirong
 */
@FeignClient(name = "user-service")
public interface UserFeignClient extends UserApi {

}
