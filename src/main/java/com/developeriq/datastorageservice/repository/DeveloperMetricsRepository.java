package com.developeriq.datastorageservice.repository;

import com.developeriq.datastorageservice.entity.DeveloperMetric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperMetricsRepository extends JpaRepository<DeveloperMetric, Long> {

}
