package youth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youth.bean.JobListBean;
import youth.bean.ResultMessageBean;
import youth.blservice.JobBLService;
import youth.blservice.JobListBLService;

import java.util.List;

/*
* @author:MAX
*/
@Api(value = "职业列表模块", description = "职业列表相关接口")
@RestController
@RequestMapping("/joblist")
public class JobListController {

    @Autowired
    private JobListBLService jobListBLService;
    @Autowired
    public JobListController(JobListBLService jobListBLService){
        this.jobListBLService=jobListBLService;

    }

      /*
    得到收藏职业列表
     */

    @ApiOperation(value = "得到收藏职业列表", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),

    })
    @PostMapping("/save/get")
    public List<JobListBean> getSavedJobList(String phone) {
        //return "hhh";
        return jobListBLService.getSavedJobList(phone);



    }

       /*
    得到推荐职业列表
    未实现
     */

    @ApiOperation(value = "得到推荐职业列表", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),

    })
    @PostMapping("/recomand/get")
    public List<JobListBean> getRecomandJobList(String phone) {
        //return "hhh";
        return jobListBLService.getRecomandJobList(phone);



    }

       /*
    搜索职业

     */

//    @ApiOperation(value = "搜索职业", notes = "可能状态码：0,1,9<br>登录成功返回签名")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
//
//    })
//    @PostMapping("/recomand/get")
//    public List<JobListBean> searchJob(String phone) {
//        //return "hhh";
//        return jobListBLService.getRecomandJobList(phone);
//}









}

