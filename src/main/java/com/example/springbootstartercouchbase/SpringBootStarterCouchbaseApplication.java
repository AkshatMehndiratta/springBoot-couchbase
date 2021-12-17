package com.example.springbootstartercouchbase;

import com.example.springbootstartercouchbase.model.Employee;
import com.example.springbootstartercouchbase.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class SpringBootStarterCouchbaseApplication {

	@Autowired
	private EmployeeRepo repository;

	@PostConstruct
	public void initEmployeeRepo(){
		repository.saveAll(Stream.of(new Employee(124, "abc"),new Employee(125,"xyz"))
				.collect(Collectors.toList()));
	}

	@GetMapping("/fetchAllEmployees")
	public Iterable<Employee> getAll(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterCouchbaseApplication.class, args);
	}

}
