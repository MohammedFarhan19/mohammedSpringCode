package de.mohammed.springCode.controller;

import org.springframework.stereotype.Controller;
/**
 * Create  => post 
 * Read    => GET 
 * Update  => PUT
 * Delete  => DELETE
 */
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		String msg = "<html><h1>hello World....</h1>"
				+ "<br>"
				+ "<h3>Spring</h3>"
				+ "<ol>IDE"
				+ 	"<li>Eclipse</li>"
				+ 	"<li>VSCode</li>"
				+ 	"<li>NetBeans</li>"
				+ "</ol>"
				+ "</html>";
		return msg;
	}
	
	@GetMapping("/helloSpring")
	public String helloSpring() {
		return "Hello Spring  :-)";
	}
	
	@GetMapping("/staffnames")
	public String getStaffName() {
		return "staffnames";  // return view
	}

}
