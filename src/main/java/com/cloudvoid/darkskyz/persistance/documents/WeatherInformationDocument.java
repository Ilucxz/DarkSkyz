package com.cloudvoid.darkskyz.persistance.documents;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("WeatherInformation")
@NoArgsConstructor
@Builder
public class WeatherInformationDocument {
}
