package practice01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello/")
public class HelloController {

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("hello")
	public ModelAndView hello(){
		return new ModelAndView("/index.jsp", "hello", "hhi");
	}

}
