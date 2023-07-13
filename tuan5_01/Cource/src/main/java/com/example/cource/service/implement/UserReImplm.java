//package com.example.cource.service.implement;
//
//import com.example.cource.model.User;
//import com.example.cource.service.UserReService;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.Map;
//
//@Repository
//public class UserReImplm implements UserReService {
//    private RedisTemplate<Long,User> redisTemplate;
//    private HashOperations operations;
//
//    public UserReImplm(RedisTemplate<Long, User> template) {
//        this.redisTemplate = template;
//        operations=template.opsForHash();
//    }
//
//    @Override
//    public User findById(Long id) {
//        return (User) operations.get("USER",id);
//    }
//
//    @Override
//    public Map<Long, User> getAll() {
//        return operations.entries("USER");
//    }
//
//    @Override
//    public void save(User user) {
//        operations.put("USER",user.getId(),user);
//    }
//
//    @Override
//    public void update(User user) {
//        operations.put("USER",user.getId(),user);
//    }
//
//    @Override
//    public void delete(Long id) {
//        operations.delete("USER",id);
//    }
//}
