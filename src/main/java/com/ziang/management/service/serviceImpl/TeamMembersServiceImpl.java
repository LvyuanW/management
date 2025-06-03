package com.ziang.management.service.serviceImpl;

import com.ziang.management.dto.TeamMemberDTO;
import com.ziang.management.dto.UpdateTeamMemberDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.TeamMembers;
import com.ziang.management.mapper.TeamMembersMapper;
import com.ziang.management.service.TeamMembersService;

@Service
public class TeamMembersServiceImpl extends ServiceImpl<TeamMembersMapper, TeamMembers> implements TeamMembersService {

    @Override
    public boolean createTeamMember(TeamMemberDTO dto){
        TeamMembers teamMember = new TeamMembers();
        teamMember.setAvatarUrl(dto.getAvatarUrl());
        teamMember.setResponsibilities(dto.getResponsibilities());
        teamMember.setDegree(dto.getDegree());
        teamMember.setTitle(dto.getTitle());
        teamMember.setRole(dto.getRole());
        teamMember.setDescription(dto.getDescription());
        teamMember.setIsDeleted(0);
        return this.save(teamMember);
    }

    @Override
    public boolean updateTeamMember(UpdateTeamMemberDTO dto) {
        TeamMembers member = new TeamMembers();
        member.setUid(dto.getUid());
        member.setAvatarUrl(dto.getAvatarUrl());
        member.setTitle(dto.getTitle());
        member.setRole(dto.getRole());
        member.setResponsibilities(dto.getResponsibilities());
        member.setDegree(dto.getDegree());
        member.setUniversity(dto.getUniversity());
        member.setDescription(dto.getDescription());
        return this.updateById(member);
    }
}