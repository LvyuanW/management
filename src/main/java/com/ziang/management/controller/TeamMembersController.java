package com.ziang.management.controller;

import com.ziang.management.dto.TeamMemberDTO;
import com.ziang.management.dto.UpdateTeamMemberDTO;
import com.ziang.management.entity.TeamMembers;
import com.ziang.management.service.TeamMembersService;
import jakarta.validation.Valid;
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
    public boolean create(@RequestBody @Valid TeamMemberDTO dto) {
        return service.createTeamMember(dto);
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
    public boolean update(@RequestBody @Valid UpdateTeamMemberDTO dto) {
        return service.updateTeamMember(dto);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}