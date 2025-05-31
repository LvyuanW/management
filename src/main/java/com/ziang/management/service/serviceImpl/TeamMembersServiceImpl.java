package com.ziang.management.service.serviceImpl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.TeamMembers;
import com.ziang.management.mapper.TeamMembersMapper;
import com.ziang.management.service.TeamMembersService;

@Service
public class TeamMembersServiceImpl extends ServiceImpl<TeamMembersMapper, TeamMembers> implements TeamMembersService {
}