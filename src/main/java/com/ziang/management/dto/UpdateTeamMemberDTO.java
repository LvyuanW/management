package com.ziang.management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateTeamMemberDTO {
    @NotBlank(message = "uid required")
    private String uid;

    private String avatarUrl;

    @NotBlank(message = "title required")
    private String title;

    @NotBlank(message = "role required")
    private String role;

    @NotBlank(message = "degree required")
    private String degree;

    @NotBlank(message = "university required")
    private String university;

    @NotBlank(message = "description required")
    private String description;
}
