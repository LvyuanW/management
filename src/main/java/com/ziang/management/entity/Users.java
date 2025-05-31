package com.ziang.management.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("users")
public class Users implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String uid; // 唯一标识符

    private String username; // 用户名

    private String password; // 密码

    private String email; // 邮箱

    private String role; // 角色

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt; // 创建时间

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updatedAt; // 更新时间

    private LocalDateTime deletedAt; // 逻辑删除时间

    @TableLogic
    private Integer isDeleted; // 逻辑删除标记

}