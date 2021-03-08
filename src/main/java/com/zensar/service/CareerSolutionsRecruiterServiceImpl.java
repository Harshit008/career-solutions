package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;
import com.zensar.repository.CareerSolutionsRepository;

@Service
public class CareerSolutionsRecruiterServiceImpl implements CareerSolutionsRecruiterService{
		@Autowired
		private CareerSolutionsRepository repository;
		
		public List<Recruiter> recruiterLogin(Recruiter recruiter) {
			return repository.recruiterLogin(recruiter);
		}
		public void jobSeekerLogin() {
			
		}
		public int insertRecruiter(Recruiter recruiter) {
			return repository.insertRecruiter(recruiter);
			
		}
	
}
