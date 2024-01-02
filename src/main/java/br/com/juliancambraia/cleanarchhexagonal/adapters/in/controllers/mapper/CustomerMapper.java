package br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.mapper;

import br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.request.CustomerRequest;
import br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.response.CustomerResponse;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
  
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "address", ignore = true)
  @Mapping(target = "isValidCpf", ignore = true)
  Customer toCustomer(CustomerRequest customerRequest);
  
  CustomerResponse toCustomerResponse(Customer customer);
}
