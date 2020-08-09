package com.home.myCafeControllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	//Return the Welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		
		return "Welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		//handle the data from the user
		String userEnterValue  = request.getParameter("foodType");
		
		//adding the capture value to the model
		model.addAttribute("userInput", userEnterValue);
		
		//set the user data with the model object and send it to the view
		return "process-order";
	}

}
