package com.Task1.StudentDetails.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Task1.StudentDetails.Model.StudentDetails;
import com.Task1.StudentDetails.Repo.StudentRepo;

public class StudentService {
	
	@Autowired
	private StudentRepo sr;
	
	public StudentDetails createStudentInfo(StudentDetails s) {
		
		
		 return	sr.save(s);
		}
	
	public List<StudentDetails> getAllStudent() {
		// TODO Auto-generated method stub
		List<StudentDetails> s=sr.findAll();
		if(s.size()>0) {
			return s;
		}
		else {
			return new ArrayList<StudentDetails>();
		}
	}
	

	}



