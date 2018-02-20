package youth.blservice;

import youth.bean.ResultMessageBean;

public interface JobService {

/*
* @author:MAX
*/


    public ResultMessageBean scanJob(String phone, String jobId);
    public ResultMessageBean likeJob(String phone, String jobId);
    public ResultMessageBean dislikeJob(String phone, String jobId);

}

