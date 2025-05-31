package com.ziang.management.service.serviceImpl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.ResearchProjects;
import com.ziang.management.mapper.ResearchProjectsMapper;
import com.ziang.management.service.ResearchProjectsService;

@Service
public class ResearchProjectsServiceImpl extends ServiceImpl<ResearchProjectsMapper, ResearchProjects> implements ResearchProjectsService {
}