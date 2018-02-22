package youth.bean;

import lombok.Data;

/*
* @author:MAX
* @note：职业列表信息
*/
@Data
public class JobListBean {

    private String jobId;
    private String jobName;
    private String companyName;
    private String location;

    private String salary;

    public JobListBean(String jobId, String jobName, String companyName, String location, String salary) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.companyName = companyName;
        this.location = location;
        this.salary = salary;
    }
}

