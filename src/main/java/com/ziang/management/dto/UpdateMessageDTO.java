package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateMessageDTO {
    @NotBlank(message = "uid required")
    private String uid;

    @NotNull(message = "required")
    private Integer isRead;
}
