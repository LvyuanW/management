package com.ziang.management.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("news")
public class News implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String uid; // 唯一标识符

    private String title; // 新闻标题

    private String content; // 新闻内容

    private String imageUrl; // 图片地址

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt; // 创建时间

    private LocalDateTime deletedAt; // 逻辑删除时间

    @TableLogic
    private Integer isDeleted; // 逻辑删除标记

}