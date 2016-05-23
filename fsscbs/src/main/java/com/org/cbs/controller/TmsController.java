package com.org.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.cbs.dao.UserDao;
import com.org.cbs.model.User;

@Controller
public class TmsController {
    @RequestMapping(value = "/tms", method = RequestMethod.GET)
	public String add(Model mm) {
    	
    	mm.addAttribute("tms", "Hello World!");
		return "tms";
	}

}
