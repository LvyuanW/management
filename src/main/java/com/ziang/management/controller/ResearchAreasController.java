package com.ziang.management.controller;

import com.ziang.management.dto.ResearchAreaDTO;
import com.ziang.management.dto.UpdateResearchAreaDTO;
import com.ziang.management.entity.ResearchAreas;
import com.ziang.management.service.ResearchAreasService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/research-areas")
public class ResearchAreasController {
    @Autowired
    private ResearchAreasService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody @Valid ResearchAreaDTO dto) {
        return service.createResearchArea(dto);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public ResearchAreas getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<ResearchAreas> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody @Valid UpdateResearchAreaDTO dto) {
        return service.updateResearchArea(dto);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}