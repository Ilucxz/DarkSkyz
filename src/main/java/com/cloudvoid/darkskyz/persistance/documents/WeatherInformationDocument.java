package com.cloudvoid.darkskyz.persistance.documents;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("WeatherInformation")
@Builder
@RequiredArgsConstructor
public class WeatherInformationDocument {

    private UUID id;
}
