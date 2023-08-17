package com.cloudvoid.darkskyz.service;

import com.cloudvoid.darkskyz.controller.WeatherDataController;
import com.cloudvoid.darkskyz.persistance.mapper.WeatherInformationMapper;
import com.cloudvoid.darkskyz.persistance.repository.WeatherInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DarkSkyWatcher {

    @Autowired
    WeatherDataController weatherDataController;
    @Autowired
    WeatherInformationMapper weatherInformationMapper;
    @Autowired
    WeatherInformationRepository weatherInformationRepository;


    @Scheduled(cron = "0/5 * * * * ?")
    void refreshActuallyWeatherData() throws IOException {
        var response = weatherDataController.requestWeatherDataTimeForecast();
        weatherInformationRepository.save(weatherInformationMapper.map(response));
    }

}
