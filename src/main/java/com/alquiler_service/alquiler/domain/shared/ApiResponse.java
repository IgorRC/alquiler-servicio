package com.alquiler_service.alquiler.domain.shared;

import java.time.OffsetDateTime;

public class ApiResponse <T>{
    private final boolean success = true;
    private final T data;
    private final OffsetDateTime timestamp = OffsetDateTime.now();

    public ApiResponse(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }
}
