package com.uallas.study.clr.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class RoomClrApplication {

    private static final Logger logger = LoggerFactory.getLogger(RoomClrApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            for(int i = 0; i < 100; i ++) {
                logger.info((i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : ((i % 3 == 0) ? "Fizz" : ((i % 5 == 0) ? "Buzz" : String.valueOf(i))));
            }
        };

    }

	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}

}
