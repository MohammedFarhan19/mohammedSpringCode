package de.mohammed.springCode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

}
