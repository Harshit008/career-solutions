package com.zensar.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor()
public class Recruiter {
		private String recruiterName;
		private String username;
		private String password;
		private int recruiterId;
		private String email;
		public String getRecruiterName() {
			return recruiterName;
		}
		public void setRecruiterName(String recruiterName) {
			this.recruiterName = recruiterName;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getRecruiterId() {
			return recruiterId;
		}
		public void setRecruiterId(int recruiterId) {
			this.recruiterId = recruiterId;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Recruiter(String recruiterName, String username, String password, int recruiterId, String email) {
			super();
			this.recruiterName = recruiterName;
			this.username = username;
			this.password = password;
			this.recruiterId = recruiterId;
			this.email = email;
		}
		public Recruiter() {
			super();
		}
		public Recruiter(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		@Override
		public String toString() {
			return "Recruiter [recruiterName=" + recruiterName + ", username=" + username + ", recruiterId="
					+ recruiterId + ", email=" + email + "]";
		}
		
		
}
