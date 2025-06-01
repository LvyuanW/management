package com.ziang.management.service.serviceImpl;

import com.ziang.management.dto.ResearchProjectDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.ResearchProjects;
import com.ziang.management.mapper.ResearchProjectsMapper;
import com.ziang.management.service.ResearchProjectsService;

@Service
public class ResearchProjectsServiceImpl extends ServiceImpl<ResearchProjectsMapper, ResearchProjects> implements ResearchProjectsService {
    @Override
    public boolean createResearchProject(ResearchProjectDTO dto){
        ResearchProjects researchProjects = new ResearchProjects();
        researchProjects.setTitle(dto.getTitle());
        researchProjects.setDescription(dto.getDescription());
        return this.save(researchProjects);
    }
}