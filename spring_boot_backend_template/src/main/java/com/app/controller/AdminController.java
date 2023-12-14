package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Admindto;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@PostMapping("/login")
	public String validate(@RequestBody Admindto admin) {
		if (admin.getEmail().equals(new String("aniketgadage@gmail.com"))
				&& admin.getPassword().equals(new String("Aniket@123"))) {
			return "Valid user";
		}
		return "InValid user";
	}
}
