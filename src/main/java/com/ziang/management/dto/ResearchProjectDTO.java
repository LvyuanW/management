package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ResearchProjectDTO {

    @NotBlank(message = "title required")
    private String title;

    private String imageUrl;

    @NotBlank(message = "description required")
    private String description;
}