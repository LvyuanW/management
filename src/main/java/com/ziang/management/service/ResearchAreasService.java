package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.ResearchAreaDTO;
import com.ziang.management.dto.UpdateResearchAreaDTO;
import com.ziang.management.entity.ResearchAreas;

public interface ResearchAreasService extends IService<ResearchAreas> {
    boolean createResearchArea(ResearchAreaDTO dto);

    boolean updateResearchArea(UpdateResearchAreaDTO dto);
}