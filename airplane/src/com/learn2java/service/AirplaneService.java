package com.learn2java.service;

import com.learn2java.pojo.AirPlane;

import java.util.List;

public interface AirplaneService {
    List<AirPlane> show(int takeid, int landid);
}
