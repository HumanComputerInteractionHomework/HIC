package youth.bean;

import lombok.Data;

import javax.persistence.*;

/*
* @author:MAX
*/

public class JobDetailBean {

    private String jobId;

    private String jobName;

    private String jobLocation;

    private String salary;

    private String companyName;

    private String companyNature;

    private String companyPeopleNum;

    private String companyIndustory;

    private String jobExperience;


    private String Education_degree;

    private String JobPeopleNum;

    private String jobTime;

    private String welfare;

    private String jobDescription;

    private String CompanyDescription;

    private String JobDescriptionHtml;

    private String company_description_html;

    private String job_city;

    private Integer salary_low;

    private Integer salary_high;


    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    public String getCompanyPeopleNum() {
        return companyPeopleNum;
    }

    public void setCompanyPeopleNum(String companyPeopleNum) {
        this.companyPeopleNum = companyPeopleNum;
    }

    public String getCompanyIndustory() {
        return companyIndustory;
    }

    public void setCompanyIndustory(String companyIndustory) {
        this.companyIndustory = companyIndustory;
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience;
    }

    public String getEducation_degree() {
        return Education_degree;
    }

    public void setEducation_degree(String education_degree) {
        Education_degree = education_degree;
    }

    public String getJobPeopleNum() {
        return JobPeopleNum;
    }

    public void setJobPeopleNum(String jobPeopleNum) {
        JobPeopleNum = jobPeopleNum;
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyDescription() {
        return CompanyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        CompanyDescription = companyDescription;
    }

    public String getJobDescriptionHtml() {
        return JobDescriptionHtml;
    }

    public void setJobDescriptionHtml(String jobDescriptionHtml) {
        JobDescriptionHtml = jobDescriptionHtml;
    }

    public String getCompany_description_html() {
        return company_description_html;
    }

    public void setCompany_description_html(String company_description_html) {
        this.company_description_html = company_description_html;
    }

    public String getJob_city() {
        return job_city;
    }

    public void setJob_city(String job_city) {
        this.job_city = job_city;
    }

    public Integer getSalary_low() {
        return salary_low;
    }

    public void setSalary_low(Integer salary_low) {
        this.salary_low = salary_low;
    }

    public Integer getSalary_high() {
        return salary_high;
    }

    public void setSalary_high(Integer salary_high) {
        this.salary_high = salary_high;
    }
}

