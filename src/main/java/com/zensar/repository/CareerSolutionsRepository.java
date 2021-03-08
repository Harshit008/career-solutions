package com.zensar.repository;

import java.util.List;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;

public interface CareerSolutionsRepository {
	public List<Recruiter> recruiterLogin(Recruiter recruiter);
	public int insertRecruiter(Recruiter recruiter);
}
