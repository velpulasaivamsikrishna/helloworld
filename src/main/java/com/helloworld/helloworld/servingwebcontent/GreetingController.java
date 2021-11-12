/**
 * 
 */
package com.helloworld.helloworld.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author admi
 *
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.helloworld.helloworld.service.GreetingService;

@Controller
public class GreetingController {

	@Autowired
	private GreetingService greetingService;
	/**
	 * This method is handling http get method request. By default http get method is called
	 * @GetMapping - http get method
	 * @PostMapping - http post method 
	 * @PUTMapping - http put method
	 * @DeleteMapping - http delete method
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	//@GetMapping("/greetings")
	@GetMapping("/")
	public String greetings(Model model) {
		//String message = "Good Morning Everyone"; //This is your data or model which you want to get displayed in page
		String message = greetingService.displayGreetings();
		model.addAttribute("message",message); //Setting the attribute of model . Model is map in which we are passing or setting data which we want to display on page
		
		return "greetings"; //Name of the view
	}
	
	
	/**
	 *  By passing query param name I am calling http get method and name is getting displayed on page or different view
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("/hello")
	public String greetingsWithNameAndOtherInfo(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		String message = greetingService.displayGreetingsWithNameAndOtherInfo();
		model.addAttribute("name", name);
		model.addAttribute("message",message);
		return "greet";
	}
	
	
	
	@GetMapping("/hello/{name}")
	public String helloWorld(@PathVariable(value="name") String name,@RequestParam(name="location", required=false, defaultValue="Hyderabad") String location, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location",location);

		return "helloWorld";
	}
	

}