package com.jimmy.TaskManager.domain.dto;

import com.jimmy.TaskManager.domain.entities.TaskPriority;
import com.jimmy.TaskManager.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
      UUID id,
      String title,
      String description,
      LocalDateTime dueDate,
      TaskPriority priority,
      TaskStatus status
) {
}
