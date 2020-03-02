package com.controller;

import com.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.service.TestService;

@Controller
public class TestController {

    @Autowired
   private TestService testService;

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView("test","msg","success");
        return mv;
    }

    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    @ResponseBody
    public SysUser test1(@PathVariable("id") Integer id ){
        SysUser SysUser = testService.getUserById(id);
        System.out.println("========================SysUser"+SysUser);
        return  SysUser;
    }

    @RequestMapping("/test2")
    public String test2(){

        return "test2";
    }

    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    @ResponseBody
    public int adduser(){

        return testService.saveUser( new SysUser(1,"hhy2"));
    }



}
