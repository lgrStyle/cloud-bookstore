package io.bookstore.user.api;

import io.bookstore.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author liguirong
 */
public interface UserApi {
    /**
     * 根据用户名密码查询用户表记录
     * @param username 用户名
     * @param password 密码
     * @return 用户对象，不存在返回null
     * */
    @GetMapping("api/user/queryByUsernameAndPassword")
    User queryByUsernameAndPassword(@RequestParam("username") String username, @RequestParam("password") String password);

    /**
     * 根据用户名ID集合查询用户集合信息
     * @param ids 用户ID集合
     * @return 用户集合对象
     * */
    @GetMapping("api/user/queryById")
    List<User> queryById(@RequestBody List<Long> ids);
}
