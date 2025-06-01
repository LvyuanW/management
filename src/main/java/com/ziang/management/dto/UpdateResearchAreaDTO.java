package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateResearchAreaDTO {

    @NotBlank(message = "UID is required")
    private String uid;

    @NotBlank(message = "Content is required")
    private String content;
}