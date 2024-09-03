package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dto.TaskDto;
import com.wipro.exception.TaskIdNotFoundException;
import com.wipro.service.TaskService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api/task")
public class TaskController {
	@Autowired
	private TaskService taskservice;
	
	@PostMapping
	public TaskDto save(@RequestBody @Valid TaskDto taskDto) {
		return taskservice.createTask(taskDto);
	}

	@GetMapping
	public List<TaskDto> getAll(){
		return taskservice.FindAll();
	}
	
	@GetMapping("/get/{taskid}")
	public TaskDto getTaskById(@PathVariable("taskid") Long id) throws TaskIdNotFoundException {
		 return taskservice.getTaskById(id);
	 }
	@GetMapping("/getalltasksbypid/{pid}")
    public List<TaskDto> getAllTasksByPid(@PathVariable("pid") Long pid)
    {
    	return taskservice.getAllTasksByPid(pid);
    }
	
	
}
