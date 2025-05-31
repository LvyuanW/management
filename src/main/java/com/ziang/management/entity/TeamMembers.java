package com.ziang.management.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("team_members")
public class TeamMembers implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String uid; // 唯一标识符

    private String avatarUrl; // 头像地址

    private String title; // 姓名/头衔

    private String role; // 角色

    private String degree; // 学位

    private String university; // 所属大学

    private String description; // 介绍

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt; // 创建时间

    private LocalDateTime deletedAt; // 逻辑删除时间

    @TableLogic
    private Integer isDeleted; // 逻辑删除标记

}