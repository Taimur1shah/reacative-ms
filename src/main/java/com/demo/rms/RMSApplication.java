package com.demo.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.demo.rms.model.Foo;

@SpringBootApplication
public class RMSApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(RMSApplication.class, args);
		
		WebClient webClient = WebClient.builder()
				.baseUrl("localhost:8080/foo/getFoo")
				.build();
		
		webClient.get()
		         .retrieve()
		         .bodyToFlux(Foo.class)
		         .subscribe(System.out::println);
	}
	

	
	
	

}
