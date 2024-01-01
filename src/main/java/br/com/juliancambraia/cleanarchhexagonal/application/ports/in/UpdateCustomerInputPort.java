package br.com.juliancambraia.cleanarchhexagonal.application.ports.in;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
  void update(Customer customer, String zipCode);
}
