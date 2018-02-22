package youth.bl;
/*
* @author:MAX
*/

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youth.bean.JobListBean;
import youth.blservice.JobListBLService;
import youth.dao.JobDetailRepository;
import youth.dao.UserRepository;
import youth.model.Education;
import youth.model.JobDetail;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobListBL implements JobListBLService {

    @Autowired
    private JobDetailRepository jobDetailRepository;
    @Override
    public List<JobListBean> getSavedJobList(String phone) {
        ArrayList<JobDetail> jobDetails= (ArrayList<JobDetail>) jobDetailRepository.getSavedJob(phone);
        ArrayList<JobListBean> jobListBeans=new ArrayList<JobListBean>();
        for (JobDetail jobDetail:jobDetails){
            JobListBean jobListBean=new JobListBean();
            System.out.println("jobId"+jobDetail.getJobId());
            BeanUtils.copyProperties(jobDetail,jobListBean);
            jobListBeans.add(jobListBean);

        }
        return jobListBeans;

    }

    @Override
    public List<JobListBean> getRecomandJobList(String phone) {
        return null;
    }
}

