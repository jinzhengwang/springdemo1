package com.example.springdemo1.conttroller;

import com.example.springdemo1.entity.TAdmin;
import com.example.springdemo1.service.TAdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    TAdminService tAdminService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "登陆成功";
    }

    @RequestMapping("/allUser")
    @ResponseBody
    public Object getUsers(@RequestParam(defaultValue = "1") Integer pageIndex,@RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<TAdmin> userList= tAdminService.getUser();
                return userList;
    }
    @RequestMapping("/getUserbyCondition")
    @ResponseBody
    public Object getUserbyCondition(@RequestParam(defaultValue = "admin") String name,String sex){
        List<TAdmin> userList= tAdminService.TadmingetUserByName(name,sex);
        return userList;
    }
    /*@RequestMapping("/addUser")
    @ResponseBody
    public Object addUser(@RequestBody TAdmin admin){
        return tAdminService.addUser(admin);
    }*/
    @RequestMapping("/addusername")
    @ResponseBody
    public  Object addusername(@RequestBody TAdmin tAdmin){
        return tAdminService.addUsername(tAdmin);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public  Object updateUser(@RequestBody TAdmin tAdmin){
        return tAdminService.updateUser(tAdmin);
    }

}
