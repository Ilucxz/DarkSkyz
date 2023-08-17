package com.cloudvoid.darkskyz.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class WeatherDataControllerTest {
    @Autowired
    WeatherDataController weatherDataController;

    @DisplayName("DarkSky Rest API Check")
    @Test
    void that_getWeatherData_works() throws IOException {
        var response = weatherDataController.requestWeatherDataTimeMachine();
        assertThat(response).isNotNull();

        response = weatherDataController.requestWeatherDataTimeForecast();
        assertThat(response).isNotNull();
    }
}