package com.pascalming.dubbodemo.service;

import com.pascalming.dubbodemo.domain.DubboDemoMysql;
import com.pascalming.dubbodemo.mapper.DubboDemoMysqlMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * @author yuming
 */

@DubboService(version = "1.0.0")
public class DubboServiceDemoMysql implements IDubboServiceDemoMysql
{
    @Autowired
    private DubboDemoMysqlMapper dubboDemoMysqlMapper;

    @Override
    public List<DubboDemoMysql> dbInfo()
    {
        return dubboDemoMysqlMapper.dbInfo();
    }

    @Scheduled(fixedRate = 3000)
    private void Task()
    {
        System.out.println("mysql dbInfo rsCount:"+dubboDemoMysqlMapper.dbInfo().size());
    }
}
