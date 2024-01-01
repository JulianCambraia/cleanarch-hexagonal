package br.com.juliancambraia.cleanarchhexagonal.application.ports.out;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
  Address find(String zipCode);
}
