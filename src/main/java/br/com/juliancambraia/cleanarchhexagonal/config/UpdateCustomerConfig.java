package br.com.juliancambraia.cleanarchhexagonal.config;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.UpdateCustomerAdapter;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.FindCustomerByIdUseCase;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
  
  @Bean
  public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                     FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                     UpdateCustomerAdapter updateCustomerAdapter) {
    return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
  }
}
