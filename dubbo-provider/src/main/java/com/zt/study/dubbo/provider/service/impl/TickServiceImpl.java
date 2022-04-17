package com.zt.study.dubbo.provider.service.impl;

import com.zt.study.dubbo.provider.service.TickService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService // 向dubbo注册中心暴露该方法
@Component
public class TickServiceImpl implements TickService {
    @Override
    public String printInfo() {
        return "hello, dubbp provider";
    }
}
