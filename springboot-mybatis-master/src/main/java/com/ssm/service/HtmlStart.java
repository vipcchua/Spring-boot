package com.ssm.service;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HtmlStart {
 
    private Logger logger = Logger.getLogger(HtmlStart.class);
 
    /*
    *   http://localhost:8080/hello?name=cn.7player
     */


    
	  @RequestMapping("/")
	    public String index() {
        return "index";
	    }
	  
	  
	    @RequestMapping("/file")
    public String hello() {
	        return "file";
	    }
	    
	    
	    @RequestMapping("/login")
	    public String login() {
	        System.out.println("撒的撒的很少是uf骄傲啥都if就偶是滴啊佛i啊哈哈赛欧粉红丝带配合的送皮肤上大佛皮1");
	        return "login";
	    }
//	    
//	    

    
    
    
}