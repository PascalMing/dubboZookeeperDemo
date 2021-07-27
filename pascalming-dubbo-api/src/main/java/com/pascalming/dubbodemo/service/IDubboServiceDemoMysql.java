package com.pascalming.dubbodemo.service;

import com.pascalming.dubbodemo.domain.DubboDemoMysql;

import java.util.List;

public interface IDubboServiceDemoMysql
{
    List<DubboDemoMysql> dbInfo();
}
