package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sis")
public class SisController {
	
	
	//@ResponseBody = This annotation is used to annotate request handler methods. The @ResponseBody annotation is similar to the @RequestBody annotation.
		//The @ResponseBody annotation indicates that the result type should be written straight in the response body in whatever format you specify like JSON or XML.
		//Spring converts the returned object into a response body by using the HttpMessageConveter.
	
	//@RequestMapping("---url---") = This annotation is used at both the class and method level. The @RequestMapping  annotation is used to map web requests onto specific handler classes and handler methods. When @RequestMapping is used on the class level,
			//it creates a base URI for which the controller will be used. When this annotation is used on methods, it will give you the URI on which the handler methods will be executed.
			//From this, you can infer that the class level request mapping will remain the same whereas each handler method will have their own request mapping.
				//Sometimes you may want to perform different operations based on the HTTP method used, even though the request URI may remain the same. In such situations,
				//you can use the method attribute of @RequestMapping with an HTTP method value to narrow down the HTTP methods in order to invoke the methods of your class.
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeUpKit() {
		
		return "Hey.... your making is here.";
	}

	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		
		return "Math Book.";
	}
}
