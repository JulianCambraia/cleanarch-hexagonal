package br.com.juliancambraia.cleanarchhexagonal.adapters.out;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Address;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
  
  private final FindAddressByZipCodeClient findAddressByZipCodeClient;
  private final AddressResponseMapper addressResponseMapper;
  
  public FindAddressByZipCodeAdapter(FindAddressByZipCodeClient findAddressByZipCodeClient, AddressResponseMapper addressResponseMapper) {
    this.findAddressByZipCodeClient = findAddressByZipCodeClient;
    this.addressResponseMapper = addressResponseMapper;
  }
  
  @Override
  public Address find(String zipCode) {
    var addressResponse = findAddressByZipCodeClient.find(zipCode);
    return addressResponseMapper.toAddress(addressResponse);
  }
}
