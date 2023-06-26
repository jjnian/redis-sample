package cn.jjnian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableCaching
public class RedisApplicaton{

    public static void main(String[] args) {
        SpringApplication.run(RedisApplicaton.class,args);
    }
}
