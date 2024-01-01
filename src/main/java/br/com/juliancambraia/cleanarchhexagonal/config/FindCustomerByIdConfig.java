package br.com.juliancambraia.cleanarchhexagonal.config;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.FindCustomerByIdAdapter;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {
  
  @Bean
  public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
    return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
  }
}
