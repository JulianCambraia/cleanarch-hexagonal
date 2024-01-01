package br.com.juliancambraia.cleanarchhexagonal.application.ports.out;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
  void update(Customer customer);
}
