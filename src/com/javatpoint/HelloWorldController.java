package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello123")
public class HelloWorldController {

	//@RequestMapping(value="/hello1", method=RequestMethod.GET);
	public String helloWorld(ModelMap map){
		String message="Hello Spring MVC how r u";
		map.addAttribute("messaage", message);
		return "hellopage";
		//return new ModelAndView("hellopage","message",message);
	}
}
