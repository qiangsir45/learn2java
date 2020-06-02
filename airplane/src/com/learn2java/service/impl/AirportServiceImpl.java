package com.learn2java.service.impl;

import com.learn2java.mapper.AirportMapper;
import com.learn2java.pojo.Airport;
import com.learn2java.service.AirportService;
import com.learn2java.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirportServiceImpl implements AirportService {

    @Override
    public List<Airport> showTakePort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        return airportMapper.selTakePort();
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        return airportMapper.selLandPort();
    }
}
