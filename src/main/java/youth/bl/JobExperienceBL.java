package youth.bl;
//.....


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youth.bean.JobExperienceBean;
import youth.bean.ResultMessageBean;
import youth.blservice.JobExperienceBLService;
import youth.dao.JobExperienceRepository;
import youth.model.JobExperience;

import java.util.List;

@Service
public class JobExperienceBL implements JobExperienceBLService {
    private final JobExperienceRepository jobExperienceRepository;

    @Autowired
    public JobExperienceBL(JobExperienceRepository jobExperienceRepository){
        this.jobExperienceRepository=jobExperienceRepository;


    }

    @Override
    public ResultMessageBean saveJobExperience(List<JobExperienceBean> jobExperienceBeans) {

        if(jobExperienceBeans.size()==0){
            return new ResultMessageBean(true);
        }
        String phone=jobExperienceBeans.get(0).getPhone();

        jobExperienceRepository.deleteByPhone(phone);


        for(JobExperienceBean jobExperienceBean:jobExperienceBeans){
            JobExperience jobExperience=new JobExperience();
            BeanUtils.copyProperties(jobExperienceBean,jobExperience);
            try {
                jobExperienceRepository.save(jobExperience);
            } catch (Exception e) {
                return new ResultMessageBean(false, "填写职业经历信息失败");
            }

        }
        return new ResultMessageBean(true);

    }

    @Override
    public List<JobExperienceBean> getJobExperience(String phone) {
        return jobExperienceRepository.findByPhone(phone);
    }
}
