package com.qbgc.admin.service.action;

import com.qbgc.admin.service.service.GetMyInfomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMyInformationAction {

    @Autowired
    private
    GetMyInfomation service;

    @GetMapping("/getInfomation")
    public String getMyInfo() {
        return service.getInformation();
    }
}
