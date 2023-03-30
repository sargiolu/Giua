package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication 
@ComponentScan
@EnableSwagger2
//Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
public class GiuaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiuaApplication.class, args);
	}

	/**
	 * Api docket.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.controller"))
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/");
	}
}
