package com.cssllctutorial.FeignTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FeignController {
	
	@Autowired
	private ProxyInterface proxy;
	
	@GetMapping("/feignget")
	public String getfeign()
	{
		return proxy.getbyfeign();
	}

}
