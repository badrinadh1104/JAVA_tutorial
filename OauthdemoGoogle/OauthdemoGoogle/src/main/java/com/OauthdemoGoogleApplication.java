package com;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthdemoGoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthdemoGoogleApplication.class, args);
	}
	@GetMapping(value = "say")
	public String sayhello() {
		return "hello badri welcome using google demo ";
	}
	@GetMapping(value = "user")
	public Principal user(Principal principal) {
		System.out.println(principal.getName());
		return principal;
	}

}
