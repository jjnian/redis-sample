package cn.jjnian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@ResponseBody
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/redis/{key}")
    public String getRedis(@PathVariable("key")String key){
        Object o = redisTemplate.opsForValue().get(key);
        return (String)o;
    }

    @GetMapping("/redis/{key}/{value}")
    public String puRedis(@PathVariable("key")String key,@PathVariable("value")String value ){
        redisTemplate.opsForValue().set(key, value);
        return "ok";
    }
}
