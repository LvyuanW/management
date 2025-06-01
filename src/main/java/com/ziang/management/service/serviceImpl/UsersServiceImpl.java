package com.ziang.management.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.dto.UpdateUserDTO;
import com.ziang.management.dto.UserDTO;
import com.ziang.management.entity.Users;
import com.ziang.management.mapper.UsersMapper;
import com.ziang.management.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    public boolean createUser(UserDTO dto) {
        Users user = new Users();
        user.setUid(UUID.randomUUID().toString());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole() != null ? dto.getRole() : "user");
        return this.save(user);
    }

    @Override
    public boolean updateUser(UpdateUserDTO dto) {
        Users user = new Users();
        user.setUid(dto.getUid());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());
        return this.updateById(user);
    }
}