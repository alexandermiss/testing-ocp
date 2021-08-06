package com.alexandermiss.demo.springconjava.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StatusController {

	@GetMapping(value="/status", produces = "application/json")
	public ResponseEntity<Object> status(){
		Map<String, String> resp = new HashMap<>();
		resp.put("status", ":D");
		return ResponseEntity.ok(resp);
	}
}
