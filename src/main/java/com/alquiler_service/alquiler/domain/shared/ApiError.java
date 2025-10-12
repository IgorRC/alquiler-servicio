package com.alquiler_service.alquiler.domain.shared;

import java.time.OffsetDateTime;

public class ApiError {
    private final boolean success = false;
    private final int status;
    private final String error;
    private final String message;
    private final String path;
    private final OffsetDateTime timestamp = OffsetDateTime.now();

    public ApiError(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }
}
