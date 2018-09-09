package com.sample.webflux;

import com.sample.webflux.controller.ReactiveTemperatureController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class WebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes() {
		return new ReactiveTemperatureController().routes();
	}
}
