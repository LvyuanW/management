package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.TeamMemberDTO;
import com.ziang.management.entity.TeamMembers;

public interface TeamMembersService extends IService<TeamMembers> {
    boolean createTeamMember(TeamMemberDTO dto);
}