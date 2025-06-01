package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.UpdateUserDTO;
import com.ziang.management.dto.UserDTO;
import com.ziang.management.entity.Users;
import jakarta.validation.Valid;

public interface UsersService extends IService<Users> {
    boolean createUser(UserDTO dto);

    boolean updateUser(@Valid UpdateUserDTO dto);
}