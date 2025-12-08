package com.example.demo.repository;

import com.example.demo.model.WeatherData;
import com.example.demo.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;

@RepositoryRestResource(path = "weatherDatas", collectionResourceRel = "weatherDatas")
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

    Page<WeatherData> findByTimestampGreaterThanEqualAndLocation(
            LocalDateTime timestamp,
            Location location,
            Pageable pageable
    );
}