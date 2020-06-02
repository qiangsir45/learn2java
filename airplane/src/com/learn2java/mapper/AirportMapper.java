package com.learn2java.mapper;

import com.learn2java.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirportMapper {
    @Select("select * from airport where id in (select distinct takeid from airplane)")
    List<Airport> selTakePort();
    @Select("select * from airport where id in (select distinct landid from airplane)")
    List<Airport> selLandPort();
}
