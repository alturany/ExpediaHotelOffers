package com.expedia.offers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.expedia.offers.service.HotelOfferService;

@SpringBootApplication(scanBasePackageClasses = { HotelOfferService.class })
@ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
