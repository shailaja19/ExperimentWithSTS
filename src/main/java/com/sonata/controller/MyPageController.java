package com.sonata.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class MyPageController{
   
  
    @RequestMapping(method = RequestMethod.GET) 
    public String helloWorld(ModelMap modelMap){
 
        modelMap.addAttribute("message1", "Welcome to sonata");
        return "mypage1";
    }
    
    @RequestMapping(value="/saykitchen", method=RequestMethod.GET)
    public String sayKitchen(ModelMap modelMap) {
        //logger.info("Welcome to my kitchen!");
        modelMap.addAttribute("color", "Blue");
        modelMap.addAttribute("size", 1000);
        return "kitchen";
    }
    
    @RequestMapping(value="/helloString/{helloId}", method = RequestMethod.GET)
    public String helloURITemplate(@PathVariable String helloId, Model model){
 
        model.addAttribute("message"+helloId, "message"+helloId + " is selected!");
        return "mypage"+helloId;
    }
    
    @RequestMapping(value = "/hello/{helloId}", method = RequestMethod.GET, params = "myCity=Bangalore")
    public String helloURIparams(@PathVariable String helloId,
    		@RequestParam("myCity") String city, Model model) {

        model.addAttribute("message" + helloId, "I live in " + city);
        return "mypage" + helloId;
    }

}