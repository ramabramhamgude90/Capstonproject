package com.wipro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.dto.TaskDto;
import com.wipro.exception.TaskIdNotFoundException;
@Service
public interface TaskService {

	public TaskDto createTask(TaskDto taskDto);

	

	public List<TaskDto> FindAll();



	public TaskDto getTaskById(Long Id) throws TaskIdNotFoundException;

  



public List<TaskDto> getAllTasksByPid(Long pid);

	



}
