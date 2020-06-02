package com.learn2java.service.impl;

import com.learn2java.mapper.AirplaneMapper;
import com.learn2java.pojo.AirPlane;
import com.learn2java.service.AirplaneService;
import com.learn2java.util.MyBatisUtil;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {

    @Override
    public List<AirPlane> show(int takeid, int landid) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
    }
}
