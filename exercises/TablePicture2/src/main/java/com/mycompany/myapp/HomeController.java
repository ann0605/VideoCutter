package com.mycompany.myapp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.text.TableView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static String letter; 
	ModelAndView mv = new ModelAndView();
	@RequestMapping(value = "/")
	public String home(){
		return "home";
	}
	@RequestMapping(value = "/tester", method = RequestMethod.POST, params = "buttonA")
	public ModelAndView buttonA(){
		letter = "A";
		System.out.println("A");
		mv.addObject("letter", letter);
		return mv;

	}
	@RequestMapping(value = "/tester", method = RequestMethod.POST, params = "buttonB")
	public ModelAndView buttonB(){
		letter = "B";
		mv.addObject("letter", letter);
		return mv;

	}
	@RequestMapping(value = "/tester", method = RequestMethod.POST, params = "buttonC")
	public ModelAndView buttonC(){
		letter = "C";
		mv.addObject("letter", letter);
		return mv;
	}
//	public  String Handler(@RequestParam(required = false, value = "A") String buttonA, @RequestParam(required = false, value = "B")String buttonB, @RequestParam(required = false, value = "C")String buttonC){
//		if (buttonA!= null){
//			letter = "A";
//		}
//		else if (buttonB != null){
//			letter = "B";
//		}
//		else if(buttonC!=null){
//			letter = "C";
//		}
//		mv.addObject("letter", letter);
//		 return "home";
	//}
	//public String multipleButtonsHandler(@RequestParam String action){
//		if(action.equals("A")){
//			letter = "A";
//		}
//		else if(action.equals("B")){
//			letter = "B";
//		}
//		else {
//			letter = "C";
//		}
//		return "redirect:tester";
//		
//	}
	
	
}

