package br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.mapper;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
  
  CustomerEntity toCustomerEntity(Customer customer);
}
