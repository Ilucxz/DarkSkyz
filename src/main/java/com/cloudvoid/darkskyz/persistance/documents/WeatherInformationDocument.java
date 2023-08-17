package com.cloudvoid.darkskyz.persistance.documents;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("WeatherInformation")
@Builder
public class WeatherInformationDocument {
    @Id
    private UUID id;
}
