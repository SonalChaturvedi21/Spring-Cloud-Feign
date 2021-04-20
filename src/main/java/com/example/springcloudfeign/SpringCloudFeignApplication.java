package com.example.springcloudfeign;

import com.example.springcloudfeign.client.UserClient;
import com.example.springcloudfeign.pojo.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
@RestController
public class SpringCloudFeignApplication {

    @Autowired
    private UserClient client;

    @GetMapping("/findAllUsers")
    public List<UserResponse> getAllUsers(){
        return client.getUsers();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApplication.class, args);
    }

}
