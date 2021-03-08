package com.zensar.service;

import java.util.List;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;

public interface CareerSolutionsRecruiterService {
	public List<Recruiter> recruiterLogin(Recruiter recruiter);
	public int insertRecruiter(Recruiter recruiter);
	
}
