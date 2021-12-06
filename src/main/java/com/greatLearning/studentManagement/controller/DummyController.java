package com.greatLearning.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {
	@RequestMapping("/")
	public String dummyPageShow() {
		return "dummy";
	}

}
