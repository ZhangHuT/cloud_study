package com.zt.study.dubbo.provider.service.impl;

import com.zt.study.dubbo.provider.service.TickService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @DubboReference
    private TickService tickService;

    public String info() {
        return tickService.printInfo();
    }
}
