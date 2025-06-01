package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.NewsDTO;
import com.ziang.management.entity.News;

public interface NewsService extends IService<News> {
    boolean createNews(NewsDTO dto);
}