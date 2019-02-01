package com.koala.controller;

import com.koala.service.UserService;
import itcat.koala.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;
    @RequestMapping("findall.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView model=new ModelAndView();
        List<User> list = userService.findAll();
        model.setViewName("list");
        model.addObject("list",list);
        System.out.println(list);

        return model;
    }
}
