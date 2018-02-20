package youth.bean;

import lombok.Data;

import java.util.List;

@Data
public class ExpectationBean {

/*
* @author:MAX
*/
    private String phone;
    private String salary;
    private Integer lowSalary;
    private Integer highSalary;

    private List<ExpectLocationBean> expectLocationBeans;
    private List<ExpectCompanyQualityBean> expectCompanyQualityBeans;
    private List<ExpectCompanyLevelBean> expectCompanyLevelBeans;
    private List<ExpectJobTypeBean> expectJobTypeBeans;
    //private List<String> location;
    //private String[] location;
    //private String[] companyQuality;
    //private String[] companyLevel;
    //private String[] jobType;


    public ExpectationBean(){

    }

    public ExpectationBean(String phone, String salary, Integer lowSalary, Integer highSalary, List<ExpectLocationBean> expectLocationBeans, List<ExpectCompanyQualityBean> expectCompanyQualityBeans, List<ExpectCompanyLevelBean> expectCompanyLevelBeans, List<ExpectJobTypeBean> expectJobTypeBeans) {
        this.phone = phone;
        this.salary = salary;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
        this.expectLocationBeans = expectLocationBeans;
        this.expectCompanyQualityBeans = expectCompanyQualityBeans;
        this.expectCompanyLevelBeans = expectCompanyLevelBeans;
        this.expectJobTypeBeans = expectJobTypeBeans;
    }
}

