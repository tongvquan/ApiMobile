package com.doanmobile.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doanmobile.dto.UserDto;
import com.doanmobile.service.IUserService;

@RestController
public class UserApi {

	@Autowired
	private IUserService userService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserDto userDto) {
		return userService.login(userDto);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable long id) {
		UserDto userDTO = userService.getUserById(id);
		return ResponseEntity.ok(userDTO);
	}
	
	
}
