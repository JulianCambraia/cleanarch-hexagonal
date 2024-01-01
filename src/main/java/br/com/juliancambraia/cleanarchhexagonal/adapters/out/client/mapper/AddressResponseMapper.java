package br.com.juliancambraia.cleanarchhexagonal.adapters.out.client.mapper;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.client.response.AddressResponse;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
  
  Address toAddress(AddressResponse addressResponse);
}
