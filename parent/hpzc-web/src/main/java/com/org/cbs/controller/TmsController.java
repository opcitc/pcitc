package com.org.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.cbs.dao.UserDao;
import com.org.cbs.model.User;

@Controller
@RequestMapping("/tms")
public class TmsController {
	@Autowired
	private UserDao dao;
    @RequestMapping(value = "/tms", method = RequestMethod.GET)
	public String add(Model mm) {
    	User u = new User();
    	u.setAge(12);
    	u.setName("zhaoyun");
    	mm.addAttribute("tms", u);
		return "tms/tms";
	}
    @RequestMapping(value = "/tmsa", method = RequestMethod.GET)
   	public String select(Model mm) {
       	User u = new User();
       	u = dao.selectById();
       	mm.addAttribute("tmsa", u);
   		return "tms/tmsa";
   	}
    @RequestMapping("/index")
   	public String index() {
   		return "common/index";
   	}

}
