package com.example.catalogservice;

import com.example.catalogservice.dto.CatalogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);



	}

}
