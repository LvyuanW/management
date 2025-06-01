package com.ziang.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@RestController
@RequestMapping("/media")
public class MediaUploadController {

    @PostMapping("/upload")
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is empty");
        }

        // 使用项目根路径为 basePath
        String basePath = new File("").getAbsolutePath();
        String dateFolder = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String saveDir = basePath + File.separator + "media" + File.separator + "uploads" + File.separator + dateFolder;

        File folder = new File(saveDir);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String originalName = file.getOriginalFilename();
        String extension = originalName != null && originalName.contains(".")
                ? originalName.substring(originalName.lastIndexOf("."))
                : "";
        String filename = UUID.randomUUID() + extension;
        File dest = new File(folder, filename);
        file.transferTo(dest);

        // 返回相对路径
        String url = "/media/uploads/" + dateFolder + "/" + filename;
        return ResponseEntity.ok(url);
    }
}
