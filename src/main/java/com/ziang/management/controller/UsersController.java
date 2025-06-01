package com.ziang.management.controller;

import com.ziang.management.dto.UpdateUserDTO;
import com.ziang.management.dto.UserDTO;
import com.ziang.management.entity.Users;
import com.ziang.management.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    public boolean create(@RequestBody @Valid UserDTO dto) {
        return usersService.createUser(dto);
    }

    @GetMapping("/get/{uid}")
    public Users getByUid(@PathVariable String uid) {
        return usersService.getById(uid);
    }

    @GetMapping("/list")
    public List<Users> list() {
        return usersService.list();
    }

    @PostMapping("/update")
    public boolean update(@RequestBody @Valid UpdateUserDTO dto) {
        return usersService.updateUser(dto);
    }

    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return usersService.removeById(uid);
    }
}