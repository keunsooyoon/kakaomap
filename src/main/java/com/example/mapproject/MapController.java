package com.example.mapproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/map0")
	public String map0() {
		return "map0";
	}
	
	@GetMapping("/map1")
	public String map1() {
		return "map1";
	}
	
	@GetMapping("/map2")
	public String map2() {
		return "map2";
	}
	
	@GetMapping("/map3")
	public String map3() {
		return "map3";
	}
	
	@GetMapping("/map4")
	public String map4() {
		return "map4";
	}
	
	@GetMapping("/map5")
	public String map5() {
		return "map5";
	}
	
	@GetMapping("/map6")
	public String map6() {
		return "map6";
	}
}
