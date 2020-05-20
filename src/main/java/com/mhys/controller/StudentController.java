package com.mhys.controller;

import com.mhys.model.Student;
import com.mhys.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/selectAlls")
    public ModelAndView selectAll(){
        List<Student> list = studentService.selectAll();
        ModelAndView modelAndView = new ModelAndView("student.jsp");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @RequestMapping("/selectByNames")
    public ModelAndView selectByName(Student student){
        List<Student> list=studentService.selectByName(student);
        ModelAndView mv= new ModelAndView("student.jsp");
        mv.addObject("list",list);
        return mv;
    }
    @RequestMapping("/dels")
    public ModelAndView del(int id){
        int count = studentService.del(id);
        if (count > 0) return new ModelAndView("/selectAlls");
        else  return  new ModelAndView("student.jsp");
    }

    @RequestMapping("/inserts")
    public ModelAndView insert(Student student){
        int count = studentService.insert(student);
        if (count>0) return  new ModelAndView("/selectByNames");
        else  return  new ModelAndView("addStu.jsp");
    }
    @RequestMapping("/selectByIds")
    public ModelAndView selectById(Student student){
        ModelAndView modelAndView = new ModelAndView("addStu.jsp");
        Student student1 = studentService.selectById(student);
        modelAndView.addObject("stu",student1);
        return modelAndView;
    }

    public  String update(@RequestParam("sid")String sid, Student student){
        //分为两种情况，如果有id就修改，没有id新增
        if (sid.equals("")){
            int count = studentService.insert(student);
            if (count > 0) return "/selectByNames";
            else  return "addStu.jsp";
        }else {
            student.setId(Integer.parseInt(sid));
            int count = studentService.update(student);
            if (count>0) return "/selectByNames";
            else  return "addStu.jsp";
        }
    }
}
