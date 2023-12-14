package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Ownerdto;
import com.app.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerservice;

	@PostMapping("/add")
	public ResponseEntity<?> addowner(@RequestBody Ownerdto owner) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ownerservice.addowner(owner));
	}
}
