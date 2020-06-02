package com.learn2java.mapper;

import com.learn2java.pojo.AirPlane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirplaneMapper {
    List<AirPlane> selByTakeidLandid(@Param("takeid")int takeid, @Param("landid")int landid);
}
