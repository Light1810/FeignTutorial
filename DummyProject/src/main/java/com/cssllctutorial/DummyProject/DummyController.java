package com.cssllctutorial.DummyProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	@GetMapping("/get")
	public String getsomething()
	{
		return "Hello World by Aakash";
	}

}
