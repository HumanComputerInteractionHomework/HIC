package youth.controller;
/*
* @author:MAX
*/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youth.bean.JobDetailBean;
import youth.bean.JobExperienceBean;
import youth.bean.ResultMessageBean;

import java.util.List;

@Api(value = "职业模块", description = "职业相关接口")
@RestController
@RequestMapping("/company")
public class CompanyController {

     /*
      公司评价
     */

    @ApiOperation(value = "收藏职位", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "company", value = "公司名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "score", value = "分数", required = true, dataType = "int"),
            @ApiImplicitParam(name = "remark", value = "评价", required = true, dataType = "String"),



    })
    @PostMapping("/remark")
    public ResultMessageBean companyRemark(String phone,String company,int score, String remark) {


        return null;

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
      公司具体信息
     */


    @ApiOperation(value = "得到公司具体信息", notes = "可能状态码：45,44,34,35")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "companyId", required = true, dataType = "MultipartFile")
    })
    @PostMapping("/getCompanyDetailMessage")
    public JobDetailBean getProjectExperience(String companyId) {
        return null;
    }




}

