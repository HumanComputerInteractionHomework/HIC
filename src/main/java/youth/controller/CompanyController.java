package youth.controller;
/*
* @author:MAX
*/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import youth.bean.CompanyRemarkBean;
import youth.bean.JobDetailBean;
import youth.bean.JobExperienceBean;
import youth.bean.ResultMessageBean;
import youth.blservice.CompanyBLService;

import java.util.List;

@Api(value = "职业模块", description = "职业相关接口")
@RestController
@RequestMapping("/company")
public class CompanyController {


    @Autowired
    private CompanyBLService companyBLService;
     /*
      公司评价
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "company", value = "公司名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "recomandScore", value = "推荐率", required = true, dataType = "int"),
            @ApiImplicitParam(name = "futureScore", value = "公司前景看好率", required = true, dataType = "int"),

            @ApiImplicitParam(name = "ceoScore", value = "ceo支持率", required = true, dataType = "int"),

            @ApiImplicitParam(name = "remark", value = "评价", required = true, dataType = "String"),



    })
    @PostMapping("/remark")
    public ResultMessageBean companyRemark(String phone,String company,int recomandScore,
                                           int futureScore,int ceoScore, String remark) {


        return companyBLService.companyRemark(phone, company, recomandScore, futureScore, ceoScore, remark);

    }

/*
      得到公司评价
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "company", value = "公司名", required = true, dataType = "String"),



    })
    @PostMapping("/remark/get")
    public CompanyRemarkBean getCompanyRemark(String company) {

        return companyBLService.getCompanyRemark(company);

    }



/*
      面试评价
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "company", value = "公司名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "result", value = "面试结果", required = true, dataType = "String"),
            @ApiImplicitParam(name = "difficulty", value = "面试难度", required = true, dataType = "int"),
            @ApiImplicitParam(name = "feeling", value = "面试感受", required = true, dataType = "int"),


            @ApiImplicitParam(name = "remark", value = "评价", required = true, dataType = "String"),



    })
    @PostMapping("/interview/remark")
    public ResultMessageBean interviewRemark(String phone,String company,String result, int difficulty,int feeling,String remark) {


        return null;

    }

    /*
      获得某个公司的面试评价页面
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
           @ApiImplicitParam(name = "company", value = "公司名", required = true, dataType = "String"),



    })
    @PostMapping("/interview/remark/get")
    public ResultMessageBean getInterviewRemark(String company) {


        return null;

    }


    /**
     得到公司具体信息
     */
    @ResponseBody
    @RequestMapping(
            value = "/jobDetail/{jobId}",
            method = RequestMethod.GET,
            produces = {"application/json; charset=UTF-8"})
    public JobDetailBean findSocialNetworkByManagerId(@PathVariable String jobId){
        return null;
    }


}

