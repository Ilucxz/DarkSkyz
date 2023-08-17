package com.cloudvoid.darkskyz.persistance.mapper;

import com.cloudvoid.darkskyz.persistance.documents.WeatherInformationDocument;
import okhttp3.Response;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WeatherInformationMapper {

    @Mapping(target = "id", expression = "java(UUID.randomUUID())")
    WeatherInformationDocument map(Response response);
}
