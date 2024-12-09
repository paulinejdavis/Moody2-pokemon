package com.Moody.spring.Moody2_pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Moody2PokemonApplication {

	@GetMapping("/helloworld")
	public String sayHello() {
		return "HelloWorld!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Moody2PokemonApplication.class, args);
	}

}
