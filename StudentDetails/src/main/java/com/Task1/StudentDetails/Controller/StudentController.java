package com.Task1.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Task1.StudentDetails.Model.StudentDetails;
import com.Task1.StudentDetails.Service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService ss;
	
	
	@GetMapping("/student")
	public ResponseEntity<?> getAllStudents(){
		List<StudentDetails> s=ss.getAllStudent();
		return new ResponseEntity<>(s, s.size()>0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/student")
	public void createStudentInfo(@RequestBody StudentDetails sd){
		ss.createStudentInfo(sd);
	}
	
	
	
	

}
