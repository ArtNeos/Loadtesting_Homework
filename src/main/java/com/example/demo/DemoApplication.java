package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ok")
	public String ok() {
		return "OK!";
	}

	@PostMapping("/person")
	public ResponseEntity<Person> person(@RequestBody Map<String, Object> request) {
		String firstName = (String) request.get("first_name");
		String lastName = (String) request.get("last_name");
		int yearOfBirth = (int) request.get("year_of_birth");
		Person person = new Person(firstName, lastName, yearOfBirth);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

}
