package youth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import youth.bean.ResultMessageBean;
import youth.blservice.UserBLService;
import youth.model.User;

import java.util.Map;

//访问：localhost:8080/user/hello，路径中不用加cloud
@Api(value = "用户模块", description = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserBLService userBLService;
    @Autowired
    public UserController(UserBLService userBLService){
        this.userBLService=userBLService;
    }

    /*
    登录
     */

    @ApiOperation(value = "账号密码登录", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),

    })
    @PostMapping("/login")
    public ResultMessageBean login(String phone, String password) {
        //return "hhh";
        return userBLService.login(phone,password);


    }


    /*
    注册
     */

    @ApiOperation(value = "注册", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "mail", value = "邮箱", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String"),

    })
    @PostMapping("/sign-up")
    public ResultMessageBean signUp(String phone, String password,String mail,String name) {


        return userBLService.signUp(phone,password,mail,name);


    }

    /*
    修改密码
     */

    @ApiOperation(value = "修改密码", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),

    })
    @PostMapping("/password")
    public ResultMessageBean editPassword(String phone, String password) {
       return userBLService.editPassword(phone,password);


    }





    @RequestMapping("/hello")
    public String say() {

        return "Helloxixiix";
    }

    @RequestMapping("/login")
    public ResultMessageBean login() {
        return null;
    }











}
