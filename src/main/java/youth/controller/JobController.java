package youth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youth.bean.ResultMessageBean;
import youth.blservice.JobService;
import youth.blservice.UserBLService;


/*
* @author:MAX
*/

@Api(value = "用户模块", description = "用户相关接口")
@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private  JobService jobService;
    @Autowired
    public JobController(JobService jobService){
        this.jobService=jobService;

    }


    /*
      收藏职位
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobId", value = "职位id", required = true, dataType = "String"),

    })
    @PostMapping("/like")
    public ResultMessageBean likeJob(String phone, String jobId) {

        System.out.println("like "+phone+" "+jobId);
        return jobService.likeJob(phone,jobId);

    }

    /*
     不喜欢职位
     */
    @ApiOperation(value = "不喜欢职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobId", value = "职位id", required = true, dataType = "String"),

    })
    @PostMapping("/dislike")
    public ResultMessageBean dislikeJob(String phone, String jobId) {
        System.out.println("dislike "+phone+" "+jobId);
        return jobService.dislikeJob(phone,jobId);

    }

     /*
      浏览职位
     */

    @ApiOperation(value = "浏览职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobId", value = "职位id", required = true, dataType = "String"),

    })
    @PostMapping("/scan")
    public ResultMessageBean scanJob(String phone, String jobId) {
        System.out.println("scan "+phone+" "+jobId);
        return jobService.scanJob(phone,jobId);

    }


}

