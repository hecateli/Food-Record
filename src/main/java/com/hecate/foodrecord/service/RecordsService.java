package com.hecate.foodrecord.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hecate.foodrecord.entity.Records;

public interface RecordsService extends IService<Records> {

    public void removeRecord(Long ids);
}
