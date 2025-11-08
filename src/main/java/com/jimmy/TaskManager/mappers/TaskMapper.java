package com.jimmy.TaskManager.mappers;


import com.jimmy.TaskManager.domain.dto.TaskDto;
import com.jimmy.TaskManager.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
