package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.MessageDTO;
import com.ziang.management.dto.UpdateMessageDTO;
import com.ziang.management.entity.Messages;
import jakarta.validation.Valid;

public interface MessagesService extends IService<Messages> {
    boolean createMessage(MessageDTO dto);

    boolean updateMessage(@Valid UpdateMessageDTO dto);
}