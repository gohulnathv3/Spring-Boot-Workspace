package io.spring.springboot.repository;

import io.spring.springboot.WikimediaData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WikimediaDataRepository extends MongoRepository<WikimediaData, String> {
}
