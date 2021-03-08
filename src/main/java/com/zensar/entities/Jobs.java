package com.zensar.entities;

import java.util.Arrays;

public class Jobs {
	
	private int jobId;
	private int recruiterId;
	private String jobTitle;
	private String jobDesc;
	private String jobField;
	private String[] skills;
	private String employementType;
	private double ctc;
	private float experienceInYears;
	private String education;
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobField() {
		return jobField;
	}
	public void setJobField(String jobField) {
		this.jobField = jobField;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getEmployementType() {
		return employementType;
	}
	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public float getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(float experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Jobs(int jobId, int recruiterId, String jobTitle, String jobDesc,
			String jobField, String[] skills, String employementType, double ctc, float experienceInYears,
			String education) {
		super();
		this.jobId = jobId;
		this.recruiterId = recruiterId;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.jobField = jobField;
		this.skills = skills;
		this.employementType = employementType;
		this.ctc = ctc;
		this.experienceInYears = experienceInYears;
		this.education = education;
	}
	
	@Override
	public String toString() {
		return "Recruiter [jobId=" + jobId + ", recruiterId=" + recruiterId + ", jobTitle=" + jobTitle + ", jobDesc="
				+ jobDesc + ", jobField=" + jobField + ", skills=" + Arrays.toString(skills) + ", employementType="
				+ employementType + ", ctc=" + ctc + ", experienceInYears=" + experienceInYears + ", education="
				+ education + "]";
	}
	public Jobs() {
		super();
	}
	
	
	
	
	

}
