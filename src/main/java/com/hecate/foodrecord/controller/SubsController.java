package com.hecate.foodrecord.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hecate.foodrecord.common.R;
import com.hecate.foodrecord.entity.Subs;
import com.hecate.foodrecord.service.SubsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/category")
public class SubsController {

    @Autowired
    private SubsService subsService;

    @GetMapping
    public R<List<Subs>> getGrain(String category){
        log.info(category);
        LambdaQueryWrapper<Subs> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(Subs::getType, category);
        List<Subs> subsList = subsService.list(queryWrapper);

        return R.success(subsList);
    }
}
