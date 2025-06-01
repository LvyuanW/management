package com.ziang.management.service.serviceImpl;

import com.ziang.management.dto.TeamDescriptionDTO;
import com.ziang.management.dto.UpdateTeamDescriptionDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.TeamDescriptions;
import com.ziang.management.mapper.TeamDescriptionsMapper;
import com.ziang.management.service.TeamDescriptionsService;

@Service
public class TeamDescriptionsServiceImpl extends ServiceImpl<TeamDescriptionsMapper, TeamDescriptions> implements TeamDescriptionsService {

    @Override
    public boolean createTeamDescription(TeamDescriptionDTO dto){
        TeamDescriptions teamDescriptions = new TeamDescriptions();
        teamDescriptions.setContent(dto.getContent());
        return this.save(teamDescriptions);
    }

    @Override
    public boolean updateTeamDescription(UpdateTeamDescriptionDTO dto) {
        TeamDescriptions desc = new TeamDescriptions();
        desc.setUid(dto.getUid());
        desc.setContent(dto.getContent());
        return this.updateById(desc);
    }
}