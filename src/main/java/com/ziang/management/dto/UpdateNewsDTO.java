package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateNewsDTO {
    @NotBlank(message = "uid required")
    private String uid;

    @NotBlank(message = "title required")
    private String title;

    private String imageUrl;

    @NotBlank(message = "content required")
    private String content;
}
