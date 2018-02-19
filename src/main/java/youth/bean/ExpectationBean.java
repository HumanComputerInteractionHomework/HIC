package youth.bean;

public class ExpectationBean {

/*
* @author:MAX
*/
private String phone;
private String salary;
private Integer lowSalary;
private Integer highSalary;
private String[] location;
private String[] companyQuality;
private String[] companyLevel;
private String[] jobType;

    public ExpectationBean(String phone, String salary, Integer lowSalary, Integer highSalary, String[] location, String[] companyQuality, String[] companyLevel, String[] jobType) {
        this.phone = phone;
        this.salary = salary;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
        this.location = location;
        this.companyQuality = companyQuality;
        this.companyLevel = companyLevel;
        this.jobType = jobType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(Integer lowSalary) {
        this.lowSalary = lowSalary;
    }

    public Integer getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(Integer highSalary) {
        this.highSalary = highSalary;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String[] getCompanyQuality() {
        return companyQuality;
    }

    public void setCompanyQuality(String[] companyQuality) {
        this.companyQuality = companyQuality;
    }

    public String[] getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(String[] companyLevel) {
        this.companyLevel = companyLevel;
    }

    public String[] getJobType() {
        return jobType;
    }

    public void setJobType(String[] jobType) {
        this.jobType = jobType;
    }
}

