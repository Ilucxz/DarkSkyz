package com.cloudvoid.darkskyz.persistance.repository;

import com.cloudvoid.darkskyz.persistance.documents.WeatherInformationDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WeatherInformationRepository extends MongoRepository<WeatherInformationDocument, UUID> {
}
