package youth.blservice;

import youth.bean.JobExperienceBean;
import youth.bean.ResultMessageBean;

import java.util.List;

public interface JobExperienceBLService {


    public ResultMessageBean saveJobExperience(List<JobExperienceBean> jobExperienceBeans) ;
    public List<JobExperienceBean> getJobExperience(String phone) ;


}
