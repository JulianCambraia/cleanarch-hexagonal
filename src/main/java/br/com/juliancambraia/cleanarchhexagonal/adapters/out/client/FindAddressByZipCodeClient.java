package br.com.juliancambraia.cleanarchhexagonal.adapters.out.client;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${cambraia.client.address.url}")
public interface FindAddressByZipCodeClient {
  
  @GetMapping("/{zipCode}")
  AddressResponse find(@PathVariable("zipCode") String zipCode);
}