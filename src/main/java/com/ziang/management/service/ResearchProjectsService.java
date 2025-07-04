package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.ResearchProjectDTO;
import com.ziang.management.dto.UpdateResearchProjectDTO;
import com.ziang.management.entity.ResearchProjects;

public interface ResearchProjectsService extends IService<ResearchProjects> {
    boolean createResearchProject(ResearchProjectDTO dto);

    boolean updateResearchProject(UpdateResearchProjectDTO dto);
}