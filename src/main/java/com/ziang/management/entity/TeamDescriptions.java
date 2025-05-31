package com.ziang.management.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("team_descriptions")
public class TeamDescriptions implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String uid; // 唯一标识符

    private String content; // 内容

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt; // 创建时间

    private LocalDateTime deletedAt; // 逻辑删除时间

    @TableLogic
    private Integer isDeleted; // 逻辑删除标记

}