package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.TeamDescriptionDTO;
import com.ziang.management.dto.UpdateTeamDescriptionDTO;
import com.ziang.management.entity.TeamDescriptions;

public interface TeamDescriptionsService extends IService<TeamDescriptions> {
    boolean createTeamDescription(TeamDescriptionDTO dto);

    boolean updateTeamDescription(UpdateTeamDescriptionDTO dto);
}