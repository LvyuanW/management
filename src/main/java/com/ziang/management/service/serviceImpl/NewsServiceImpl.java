package com.ziang.management.service.serviceImpl;

import com.ziang.management.dto.NewsDTO;
import com.ziang.management.dto.UpdateNewsDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziang.management.entity.News;
import com.ziang.management.mapper.NewsMapper;
import com.ziang.management.service.NewsService;

@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

    @Override
    public boolean createNews(NewsDTO dto){
        News news = new News();
        news.setTitle(dto.getTitle());
        news.setContent(dto.getContent());
        news.setImageUrl(dto.getImageUrl());
        return this.save(news);
    }

    @Override
    public boolean updateNews(UpdateNewsDTO dto) {
        News news = new News();
        news.setUid(dto.getUid());
        news.setTitle(dto.getTitle());
        news.setContent(dto.getContent());
        news.setImageUrl(dto.getImageUrl());
        return this.updateById(news);
    }
}