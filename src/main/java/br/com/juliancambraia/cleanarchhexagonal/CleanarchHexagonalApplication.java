package br.com.juliancambraia.cleanarchhexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CleanarchHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanarchHexagonalApplication.class, args);
	}

}
