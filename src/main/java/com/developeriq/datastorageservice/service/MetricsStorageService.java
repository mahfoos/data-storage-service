package com.developeriq.datastorageservice.service;

import com.developeriq.datastorageservice.entity.DeveloperMetric;
import com.developeriq.datastorageservice.repository.DeveloperMetricsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetricsStorageService {

    private final DeveloperMetricsRepository metricsRepository;

    @Autowired
    public MetricsStorageService(DeveloperMetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }

    public void storeMetrics(DeveloperMetric metrics) {
        DeveloperMetric metricEntity = new DeveloperMetric();
        metricEntity.setUserId(metrics.getUserId());
        metricEntity.setCommitCount(metrics.getCommitCount());
        metricEntity.setIssuesCount(metrics.getIssuesCount());
        metricEntity.setPrCount(metrics.getPrCount());
        metricEntity.setIssueParticipationCount(metrics.getIssueParticipationCount());

        metricsRepository.save(metricEntity);
    }
}