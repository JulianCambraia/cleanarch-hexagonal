package br.com.juliancambraia.cleanarchhexagonal.config;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.DeleteCustomerByIdAdapter;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
  
  @Bean
  public DeleteCustomerByIdUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                         DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
    return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
  }
}
