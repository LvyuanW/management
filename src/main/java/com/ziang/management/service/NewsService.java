package com.ziang.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziang.management.dto.NewsDTO;
import com.ziang.management.dto.UpdateNewsDTO;
import com.ziang.management.entity.News;
import jakarta.validation.Valid;

public interface NewsService extends IService<News> {
    boolean createNews(NewsDTO dto);

    boolean updateNews(@Valid UpdateNewsDTO dto);
}