package com.wade.spring.mvc.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class IndexController {
	private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
}
