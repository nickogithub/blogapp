package com.blogapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
   @RequestMapping(value="/index")
	public String indexPage(){
		return "/WEB-INF/views/index.jsp";
	}
}
