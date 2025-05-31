package com.ziang.management.controller;

import com.ziang.management.entity.Users;
import com.ziang.management.service.UsersService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody Users entity) {
        return service.save(entity);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public Users getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<Users> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody Users entity) {
        return service.updateById(entity);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}