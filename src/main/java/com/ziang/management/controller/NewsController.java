package com.ziang.management.controller;

import com.ziang.management.dto.NewsDTO;
import com.ziang.management.dto.UpdateNewsDTO;
import com.ziang.management.entity.News;
import com.ziang.management.service.NewsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService service;

    // Create
    @PostMapping("/create")
    public boolean create(@RequestBody @Valid NewsDTO dto) {
        return service.createNews(dto);
    }

    // Read by UID
    @GetMapping("/get/{uid}")
    public News getByUid(@PathVariable String uid) {
        return service.getById(uid);
    }

    // List all (non-deleted)
    @GetMapping("/list")
    public List<News> list() {
        return service.list();
    }

    // Update
    @PostMapping("/update")
    public boolean update(@RequestBody @Valid UpdateNewsDTO dto) {
        return service.updateNews(dto);
    }

    // Delete (logical)
    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable String uid) {
        return service.removeById(uid);
    }
}