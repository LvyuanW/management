package com.ziang.management.controller;

import com.ziang.management.dto.ResearchProjectDTO;
import com.ziang.management.entity.ResearchProjects;
import com.ziang.management.service.ResearchProjectsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/research-projects")
public class ResearchProjectsController {
    @Autowired
    private ResearchProjectsService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody @Valid ResearchProjectDTO dto) {
        return service.createResearchProject(dto);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public ResearchProjects getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<ResearchProjects> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody ResearchProjects entity) {
        return service.updateById(entity);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}