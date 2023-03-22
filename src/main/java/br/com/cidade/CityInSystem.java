package br.com.cidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.cidade.infraestrutura.model")
public class CityInSystem {

	public static void main(String[] args) {
		SpringApplication.run(CityInSystem.class, args);
	}

}
