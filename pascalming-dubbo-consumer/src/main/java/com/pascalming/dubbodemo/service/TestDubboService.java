package com.pascalming.dubbodemo.service;

import com.pascalming.dubbodemo.domain.DubboDemoInfoApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class TestDubboService {

    @DubboReference(version = "${demo.service.version}")
    private IDubboServiceDemoInfo dubboServiceDemoInfo;

    @DubboReference(version = "${demo.service.version}")
    private IDubboServiceDemoMysql dubboServiceDemoMysql;

    @Scheduled(fixedRate = 1000)
    public void doTask()
    {
        if ( dubboServiceDemoInfo != null && dubboServiceDemoMysql !=null ) {
            DubboDemoInfoApi api = dubboServiceDemoInfo.info();

            System.out.println("info:"+api.info+" ts: "+api.ts+" count: "+api.count+",mysql:"+dubboServiceDemoMysql.dbInfo().size());
        }
        else {
            System.out.print(".");
        }

    }
}
