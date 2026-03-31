package com.health_service.health_service.dto;

import java.time.LocalDateTime;

public class HealthResponse {
    private String applicationName;
    private LocalDateTime timestamp;
    private String buildVersion;
    private String description;

    public HealthResponse(String applicationName,
                          LocalDateTime timestamp,
                          String buildVersion,
                          String description) {
        this.applicationName = applicationName;
        this.timestamp = timestamp;
        this.buildVersion = buildVersion;
        this.description = description;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public String getDescription() {
        return description;
    }
}
