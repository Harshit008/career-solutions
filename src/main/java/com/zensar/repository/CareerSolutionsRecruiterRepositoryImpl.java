package com.zensar.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;

@Repository
public class CareerSolutionsRecruiterRepositoryImpl implements CareerSolutionsRepository {
	@Autowired
	private JdbcTemplate template;

	public List<Recruiter> recruiterLogin(final Recruiter recruiter){
		String sql="select * from test_login where userName='"+recruiter.getUsername()+"' and password='"+recruiter.getPassword()+"';";
		return template.query(sql, new RowMapper<Recruiter>() {

			public Recruiter mapRow(ResultSet rs, int rowNum) throws SQLException {
				while(rs.next()) {
					if(recruiter.getUsername()==rs.getString(1)&&recruiter.getPassword()==rs.getString(2)) {
						return recruiter;
					}
					else
						return null;
				}
				//return null;
				return null;
			}
		});

	}

	public int insertRecruiter(Recruiter recruiter) {
		return template.update("insert into recruiter values('"+recruiter.getRecruiterName()+"','"+recruiter.getPassword()+"',"+recruiter.getRecruiterId()+",'"+recruiter.getEmail()+"','"+recruiter.getUsername()+"');");
		
	}
}
