package com.pascalming.dubbodemo.mapper;

import com.pascalming.dubbodemo.domain.DubboDemoMysql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DubboDemoMysqlMapper {
    @Select("SELECT host,db from mysql.db")
    @Results(value = {
            @Result(property="host",column="host"),
            @Result(property="db",column="db")
    })
    List<DubboDemoMysql> dbInfo();
}
