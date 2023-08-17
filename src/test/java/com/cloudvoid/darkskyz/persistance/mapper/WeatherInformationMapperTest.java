package com.cloudvoid.darkskyz.persistance.mapper;

import com.cloudvoid.darkskyz.controller.WeatherDataController;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WeatherInformationMapperTest {

    @Autowired
    WeatherDataController weatherDataController;
    WeatherInformationMapper weatherInformationMapper = Mappers.getMapper(WeatherInformationMapper.class);
    @Test
    void that_Repsone_to_weatherInformation_mapping_works() throws IOException {
        var document = weatherInformationMapper.map(weatherDataController.requestWeatherDataTimeForecast());
        assertThat(document).isNotNull();
    }
}