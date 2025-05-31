package com.ziang.management.controller;

import com.ziang.management.entity.Messages;
import com.ziang.management.service.MessagesService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessagesController {
    @Autowired
    private MessagesService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody Messages entity) {
        return service.save(entity);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public Messages getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<Messages> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody Messages entity) {
        return service.updateById(entity);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}