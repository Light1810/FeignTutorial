package com.cssllctutorial.FeignTutorial;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="dummy",url="http://localhost:8081")
public interface ProxyInterface {
	
	@GetMapping("/get")
	public String getbyfeign();

}
