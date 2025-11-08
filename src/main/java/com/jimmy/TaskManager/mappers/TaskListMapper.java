package com.jimmy.TaskManager.mappers;

import com.jimmy.TaskManager.domain.dto.TaskListDto;
import com.jimmy.TaskManager.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
