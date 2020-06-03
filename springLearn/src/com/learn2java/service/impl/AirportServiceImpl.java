package com.learn2java.service.impl;

import com.learn2java.mapper.AirportMapper;
import com.learn2java.pojo.Airport;
import com.learn2java.service.AirportService;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    private AirportMapper airportMapper;

    public AirportMapper getAirportMapper() {
        return airportMapper;
    }

    public void setAirportMapper(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    @Override
    public List<Airport> show() {
        return airportMapper.selAll();
    }
}
