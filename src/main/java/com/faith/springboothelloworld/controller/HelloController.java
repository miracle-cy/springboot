package com.faith.springboothelloworld.controller;

import com.faith.springboothelloworld.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
//@ResponseBody
//@Controller
// RestController = Controller + ResponseBody
@Controller
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String user){
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "<p>hello world quick!</p>";
    }

    //查出一些数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好！</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));

        return "success";


    }


}
