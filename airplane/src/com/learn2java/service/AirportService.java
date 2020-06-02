package com.learn2java.service;

import com.learn2java.pojo.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> showTakePort();
    List<Airport> showLandPort();
}
