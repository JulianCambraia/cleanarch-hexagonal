package br.com.juliancambraia.cleanarchhexagonal.application.ports.in;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
  
  Customer find(String id);
}
