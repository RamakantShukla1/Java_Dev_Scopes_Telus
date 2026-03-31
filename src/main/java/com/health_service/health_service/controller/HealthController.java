package com.health_service.health_service.controller;

import com.health_service.health_service.config.AppConfigProperties;
import com.health_service.health_service.dto.HealthResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {
    @Value("${spring.application.name}")
    private String appName;

    private final AppConfigProperties configProperties;

    public HealthController(AppConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    @GetMapping("/health/details")
    public HealthResponse getHealthDetails() {

        String buildVersion =
                System.getenv().getOrDefault("BUILD_VERSION", "2.0.10");

        return new HealthResponse(
                appName,
                LocalDateTime.now(),
                buildVersion,
                configProperties.getDescription()
        );
    }
}
