package com.hecate.foodrecord.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hecate.foodrecord.common.R;
import com.hecate.foodrecord.entity.Subs;
import com.hecate.foodrecord.entity.Records;
import com.hecate.foodrecord.service.RecordsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/record")
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Records records){
        log.info(records.toString());
        log.info(records.getSub());
        log.info(records.getAmount());

        recordsService.save(records);

        return R.success("Add successfully");
    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String date){
//        log.info("page={}. pageSize={}, Date={}", page, pageSize, date);

        Page pageInfo = new Page(page, pageSize);

        LambdaQueryWrapper<Records> queryWrapper = new LambdaQueryWrapper();

        queryWrapper.eq(Records::getDate, date);

        queryWrapper.orderByDesc(Records::getMeal);

        recordsService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }

    @DeleteMapping
    public R<String> delete(@RequestParam Long ids){
        log.info("ids:{}", ids);

        recordsService.removeById(ids);

        return R.success("Delete successfully");
    }

    @PutMapping
    public R<String> update(HttpServletRequest request,@RequestBody Records records){
        log.info(records.toString());

        long id = Thread.currentThread().getId();
        recordsService.updateById(records);

        return R.success("Edit successfully");
    }

    @GetMapping("/{id}")
    public R<Records> getById(@PathVariable Long id){
        Records records = recordsService.getById(id);
        if(records != null){
            return R.success(records);
        }
        return R.error("Error");
    }

}
