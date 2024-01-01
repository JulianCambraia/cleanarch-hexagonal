package br.com.juliancambraia.cleanarchhexagonal.config;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.InsertCustomerAdapter;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.SendCpfValidationAdapter;
import br.com.juliancambraia.cleanarchhexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
  
  @Bean
  public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                     InsertCustomerAdapter insertCustomerAdapter,
                                                     SendCpfValidationAdapter sendCpfValidationAdapter) {
    return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
  }
}
