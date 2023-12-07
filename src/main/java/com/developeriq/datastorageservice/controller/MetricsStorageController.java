package com.developeriq.datastorageservice.controller;

import com.developeriq.datastorageservice.entity.DeveloperMetric;
import com.developeriq.datastorageservice.service.MetricsStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class MetricsStorageController {

    private final MetricsStorageService storageService;

    @Autowired
    public MetricsStorageController(MetricsStorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/metrics")
    public ResponseEntity<?> storeMetrics(@RequestBody DeveloperMetric metrics) {
        storageService.storeMetrics(metrics);
        return ResponseEntity.ok().build();
    }
}
