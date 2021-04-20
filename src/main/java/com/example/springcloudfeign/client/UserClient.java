package com.example.springcloudfeign.client;

import com.example.springcloudfeign.pojo.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(url = "http://jsonplaceholder.typicode.com", name = "USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();
}
