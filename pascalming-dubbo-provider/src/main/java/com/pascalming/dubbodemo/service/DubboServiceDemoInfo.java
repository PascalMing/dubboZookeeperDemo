package com.pascalming.dubbodemo.service;

import com.pascalming.dubbodemo.domain.*;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Date;

/**
 * @author yuming
 */

@DubboService(version = "1.0.0")
public class DubboServiceDemoInfo implements IDubboServiceDemoInfo
{
    private int count = 0;

    @Override
    public DubboDemoInfoApi info()
    {
        DubboDemoInfoApi api = new DubboDemoInfoApi();
        api.info="from pascalming-dubbo-producer";
        api.ts = (new Date()).toString();
        api.count = ++count;
        return api;
    }
}
