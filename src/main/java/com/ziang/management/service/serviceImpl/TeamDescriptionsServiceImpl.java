package com.ziang.management.service.serviceImpl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.TeamDescriptions;
import com.ziang.management.mapper.TeamDescriptionsMapper;
import com.ziang.management.service.TeamDescriptionsService;

@Service
public class TeamDescriptionsServiceImpl extends ServiceImpl<TeamDescriptionsMapper, TeamDescriptions> implements TeamDescriptionsService {
}