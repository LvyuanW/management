package com.ziang.management.controller;

import com.ziang.management.entity.TeamMembers;
import com.ziang.management.service.TeamMembersService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/team-members")
public class TeamMembersController {
    @Autowired
    private TeamMembersService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody TeamMembers entity) {
        return service.save(entity);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public TeamMembers getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<TeamMembers> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody TeamMembers entity) {
        return service.updateById(entity);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}