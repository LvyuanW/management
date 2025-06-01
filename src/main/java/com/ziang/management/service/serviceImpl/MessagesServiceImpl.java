package com.ziang.management.service.serviceImpl;

import com.ziang.management.dto.MessageDTO;
import com.ziang.management.dto.UpdateMessageDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.Messages;
import com.ziang.management.mapper.MessagesMapper;
import com.ziang.management.service.MessagesService;

@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages> implements MessagesService {

    @Override
    public boolean createMessage(MessageDTO dto){
        Messages messages = new Messages();
        messages.setMessage(dto.getMessage());
        messages.setName(dto.getName());
        messages.setSubject(dto.getSubject());
        messages.setEmail(dto.getEmail());
        return this.save(messages);
    }

    public boolean updateMessage(UpdateMessageDTO dto) {
        Messages msg = new Messages();
        msg.setUid(dto.getUid());
        msg.setIsRead(dto.getIsRead());
        return this.updateById(msg);
    }

}