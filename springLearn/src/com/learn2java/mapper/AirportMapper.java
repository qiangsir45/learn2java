package com.learn2java.mapper;

import com.learn2java.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirportMapper {
    @Select("select * from airport")
    List<Airport> selAll();
}
