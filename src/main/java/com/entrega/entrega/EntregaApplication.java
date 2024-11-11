package com.entrega.entrega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.entrega.entrega")  // Escanea el paquete donde está la clase Estudiante
public class EntregaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EntregaApplication.class, args);
	}
}
