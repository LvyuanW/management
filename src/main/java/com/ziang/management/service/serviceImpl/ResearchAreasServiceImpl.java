package com.ziang.management.service.serviceImpl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.ResearchAreas;
import com.ziang.management.mapper.ResearchAreasMapper;
import com.ziang.management.service.ResearchAreasService;

@Service
public class ResearchAreasServiceImpl extends ServiceImpl<ResearchAreasMapper, ResearchAreas> implements ResearchAreasService {
}