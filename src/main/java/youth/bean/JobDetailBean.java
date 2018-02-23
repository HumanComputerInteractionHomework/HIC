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

    private String educationDegree;

    private String jobPeopleNum;

    private String jobTime;

    private String welfare;

    private String jobDescriptionHtml;

    private String companyDescriptionHtml;

    private String jobCity;

    private Integer salaryLow;

    private Integer salaryHigh;

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

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getJobPeopleNum() {
        return jobPeopleNum;
    }

    public void setJobPeopleNum(String jobPeopleNum) {
        this.jobPeopleNum = jobPeopleNum;
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

    public String getJobDescriptionHtml() {
        return jobDescriptionHtml;
    }

    public void setJobDescriptionHtml(String jobDescriptionHtml) {
        this.jobDescriptionHtml = jobDescriptionHtml;
    }

    public String getCompanyDescriptionHtml() {
        return companyDescriptionHtml;
    }

    public void setCompanyDescriptionHtml(String companyDescriptionHtml) {
        this.companyDescriptionHtml = companyDescriptionHtml;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public Integer getSalaryLow() {
        return salaryLow;
    }

    public void setSalaryLow(Integer salaryLow) {
        this.salaryLow = salaryLow;
    }

    public Integer getSalaryHigh() {
        return salaryHigh;
    }

    public void setSalaryHigh(Integer salaryHigh) {
        this.salaryHigh = salaryHigh;
    }

    public JobDetailBean(){

    }

    public JobDetailBean(String jobId, String jobName, String jobLocation, String salary, String companyName, String companyNature, String companyPeopleNum, String companyIndustory, String jobExperience, String educationDegree, String jobPeopleNum, String jobTime, String welfare, String jobDescriptionHtml, String companyDescriptionHtml, String jobCity, Integer salaryLow, Integer salaryHigh) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobLocation = jobLocation;
        this.salary = salary;
        this.companyName = companyName;
        this.companyNature = companyNature;
        this.companyPeopleNum = companyPeopleNum;
        this.companyIndustory = companyIndustory;
        this.jobExperience = jobExperience;
        this.educationDegree = educationDegree;
        this.jobPeopleNum = jobPeopleNum;
        this.jobTime = jobTime;
        this.welfare = welfare;
        this.jobDescriptionHtml = jobDescriptionHtml;
        this.companyDescriptionHtml = companyDescriptionHtml;
        this.jobCity = jobCity;
        this.salaryLow = salaryLow;
        this.salaryHigh = salaryHigh;
    }

    @Override
    public String toString() {
        return "JobDetailBean{" +
                "jobId='" + jobId + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobLocation='" + jobLocation + '\'' +
                ", salary='" + salary + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyNature='" + companyNature + '\'' +
                ", companyPeopleNum='" + companyPeopleNum + '\'' +
                ", companyIndustory='" + companyIndustory + '\'' +
                ", jobExperience='" + jobExperience + '\'' +
                ", educationDegree='" + educationDegree + '\'' +
                ", jobPeopleNum='" + jobPeopleNum + '\'' +
                ", jobTime='" + jobTime + '\'' +
                ", welfare='" + welfare + '\'' +
                ", jobDescriptionHtml='" + jobDescriptionHtml + '\'' +
                ", companyDescriptionHtml='" + companyDescriptionHtml + '\'' +
                ", jobCity='" + jobCity + '\'' +
                ", salaryLow=" + salaryLow +
                ", salaryHigh=" + salaryHigh +
                '}';
    }
}

