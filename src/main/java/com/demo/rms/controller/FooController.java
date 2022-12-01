package com.demo.rms.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rms.model.Foo;

import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/foo")
public class FooController {
	
	@GetMapping(value="/getFoo", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	private Flux<Foo> getFoo() {
        return Flux.interval(Duration.ofSeconds(1))
        		    .log()
        		    .map(val -> new Foo(1,"MyFoo"));
	}

}
