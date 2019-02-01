package com.qbgc.admin.service.service.impl;

import com.qbgc.admin.service.config.GcConfig;
import com.qbgc.admin.service.service.GetMyInfomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetMyInformationImpl implements GetMyInfomation {

    @Autowired
    GcConfig config;

    @Override
    public String getInformation() {
        return config.getName()+config.getSex();
    }
}
