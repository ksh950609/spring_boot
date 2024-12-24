package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MainController {
//    @GetMapping("/sbb")
//    @ResponseBody 
//    public String index() {
//        return "question";
//    }
	@RequestMapping("/main")
	public ModelAndView viewMain(@RequestParam Map<String, Object> paramsMap, ModelAndView mav,
			HttpServletRequest request, HttpServletResponse response) throws DataNotFoundException {
		mav.setViewName("/main");
		mav.addObject("error", request.getAttribute("error"));
		return mav;
	}
    
//    @GetMapping("/")
//    public String root() {
//        return "redirect:/question/list";
//    }
}
