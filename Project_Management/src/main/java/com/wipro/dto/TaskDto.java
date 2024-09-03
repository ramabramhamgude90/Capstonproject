package com.wipro.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
	private Long taskid;
	private Long pid;
	private String taskname;
	private String taskDescription;
	private String taskStatus;

}




