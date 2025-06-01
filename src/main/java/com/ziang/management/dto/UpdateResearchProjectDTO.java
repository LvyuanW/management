package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateResearchProjectDTO {

    @NotBlank(message = "UID is required")
    private String uid;

    @NotBlank(message = "Title is required")
    private String title;

    private String imageUrl;

    @NotBlank(message = "Description is required")
    private String description;
}