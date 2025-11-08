package com.jimmy.TaskManager.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
