package br.com.juliancambraia.cleanarchhexagonal.application.ports.in;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
  void insert(Customer customer, String zipCode);
}
