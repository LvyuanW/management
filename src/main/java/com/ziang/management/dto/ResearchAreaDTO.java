package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ResearchAreaDTO {

    @NotBlank(message = "content required")
    private String content;
}
