package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
     @RequestMapping("/home")
     public String displayHome()
     {
    	 return "home";
     }
     
     @RequestMapping("/about")
     public String displayAbout()
     { 
    	 return "about";
     }
     
     @RequestMapping("/contact")
     public String displayContact()
     {
    	 return "contact";
     }
}
