package com.etoak.controller;

import com.etoak.bean.Student;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class HomeController {

    int id = 0;
    List<Student> stuList = new ArrayList<>();

    @RequestMapping("/add")
    public String add(Student stu){
        System.out.println(stu);
        if (stu.getName()!=null) {
            stu.setId(id++);
            stuList.add(stu);
        }
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List list(Model model){
        return stuList;
    }
}
