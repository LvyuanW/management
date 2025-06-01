package com.ziang.management.controller;

import com.ziang.management.dto.TeamDescriptionDTO;
import com.ziang.management.dto.UpdateTeamDescriptionDTO;
import com.ziang.management.entity.TeamDescriptions;
import com.ziang.management.service.TeamDescriptionsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/team-descriptions")
public class TeamDescriptionsController {
    @Autowired
    private TeamDescriptionsService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody @Valid TeamDescriptionDTO dto) {
        return service.createTeamDescription(dto);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public TeamDescriptions getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<TeamDescriptions> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody @Valid UpdateTeamDescriptionDTO dto) {
        return service.updateTeamDescription(dto);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}