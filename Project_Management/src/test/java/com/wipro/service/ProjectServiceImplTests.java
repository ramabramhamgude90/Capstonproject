package com.wipro.service;

//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.BDDMockito;
//import org.mockito.Mockito;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.wipro.dto.ProjectDto;
//import com.wipro.entity.Project;
//import com.wipro.repository.ProjectRepository;
//
//public class ProjectServiceImplTests {
//	private ProjectRepository repository;
//	private ProjectService service;
//	@Autowired
//	private ModelMapper mp;
//	@Test
//	@BeforeEach
//	public void setUp() {
//		repository = Mockito.mock(ProjectRepository.class);
//		service = new ProjectServiceImpl(repository);
//		
//	}
//	@Test
//	@DisplayName("junit testing for saving project method")
//	public void savedProjects() {
//		Project project = Project.builder().pid((long)1).projectName("Work").projectDescription("manage work").startTime("05-22-2022").endTime("09-08-2023").build();
//		BDDMockito.given(repository.save(project)).willReturn(project);
//		ProjectDto p3 = mp.map(project, ProjectDto.class);
//		ProjectDto p = service.createUser(p3);
//		Project p2 = mp.map(p, Project.class);
//		assertThat(p2).isNotNull();
//	}
//}
