package youth.blservice;

import youth.bean.JobListBean;

import java.util.List;

/*
* @author:MAX
*/
public interface JobListBLService {


    public List<JobListBean> getSavedJobList(String phone);
    public List<JobListBean> getRecomandJobList(String phone);


}

