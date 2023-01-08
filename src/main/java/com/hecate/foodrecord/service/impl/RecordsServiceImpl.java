package com.hecate.foodrecord.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hecate.foodrecord.entity.Records;
import com.hecate.foodrecord.mapper.RecordsMapper;
import com.hecate.foodrecord.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordsServiceImpl extends ServiceImpl<RecordsMapper, Records> implements RecordsService {

    @Autowired
    private RecordsService recordsService;

    @Transactional
    public void removeRecord(Long ids) {

        this.removeById(ids);
    }
}
