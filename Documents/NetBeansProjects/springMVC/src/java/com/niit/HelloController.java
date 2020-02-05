package com.niit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.model.StudentModel;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author UCHE
 */
@Controller
public class HelloController{
    
    @RequestMapping("/")
    @ResponseBody
    public  String hello(){
        return "Welcome to NIIT";
    }
    
    @RequestMapping("/Hello")
    @ResponseBody
    public  String HelloMap(){
        return "Hello All";
    }
    
    public HelloController() {
    }
    
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ModelAndView getLoginForm()
            {
        ModelAndView mv = new ModelAndView("Hello");
        mv.addObject("head", "Welcome to NIIT Institution");
        return mv;
    }
    
    @RequestMapping(value = "/welcomepage", method = RequestMethod.POST)
    public ModelAndView index(@ModelAttribute("studentModel") StudentModel studentModel)
            {
//                StudentModel studentModel = new StudentModel();
//                studentModel.setStudentName(name);
//                studentModel.setStudentLoaction(location);
        ModelAndView mv = new ModelAndView();
        mv.addObject("head", "Welcome to NIIT Institution");
        mv.addObject("studentModel", studentModel);
        mv.setViewName("welcomePage");
//        mv.addObject("name", name);
//        mv.addObject("message", "Your information has been Submitted by you ; " + name + "from your Location ;" + location );
        return mv;
    }
    
//    @RequestMapping(value = "/welcomepage", method = RequestMethod.POST)
//    public ModelAndView index(@RequestParam ("studentName") String name, @RequestParam("studentLocation") String location)
//            {
//                StudentModel studentModel = new StudentModel();
//                studentModel.setStudentName(name);
//                studentModel.setStudentLoaction(location);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("head", "Welcome to NIIT Institution");
//        mv.addObject("studentModel", studentModel);
//        mv.setViewName("welcomePage");
////        mv.addObject("name", name);
////        mv.addObject("message", "Your information has been Submitted by you ; " + name + "from your Location ;" + location );
//        return mv;
//    }
    
    @RequestMapping(value = "/hellocustomer", method = RequestMethod.GET)
    public String printCustomer(ModelMap model){
        model.addAttribute("message", "hello Welcome to NIIT");
        return "Hello";
    }
    
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public ModelAndView addCustomer(@PathParam("name") String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Hello");
        mv.addObject("name", name);
        return mv;
    }
}
