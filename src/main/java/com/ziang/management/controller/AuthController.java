package com.ziang.management.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ziang.management.dto.UserLoginDTO;
import com.ziang.management.entity.Users;
import com.ziang.management.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsersMapper usersMapper;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Validated UserLoginDTO dto) {
        // 1. 查用户
        Users user = usersMapper.selectOne(
                new QueryWrapper<Users>()
                        .eq("username", dto.getUsername())
                        .eq("is_deleted", 0)
                        .last("LIMIT 1")
        );

        // 2. 校验存在
        if (user == null) {
            return ResponseEntity.status(401).body(Map.of("code", 401, "message", "User not found"));
        }

        // 3. 校验密码（明文比较）
        if (!dto.getPassword().equals(user.getPassword())) {
            return ResponseEntity.status(401).body(Map.of("code", 401, "message", "Incorrect password"));
        }

        // 4. 返回登录成功响应（先用 UUID 模拟 token）
        String token = UUID.randomUUID().toString(); // 后续可换成 JWT
        return ResponseEntity.ok(Map.of(
                "code", 200,
                "message", "Login success",
                "data", Map.of("token", token, "username", user.getUsername(), "role", user.getRole())
        ));
    }
}

