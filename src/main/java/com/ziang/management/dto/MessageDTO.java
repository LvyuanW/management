package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MessageDTO {
    @NotBlank(message = "name required")
    private String name;

    @NotBlank(message = "email required")
    private String email;

    @NotBlank(message = "subject required")
    private String subject;

    @NotBlank(message = "message required")
    private String message;

    @NotNull(message = "required")
    private String isRead;
}
