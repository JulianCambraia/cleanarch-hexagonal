package br.com.juliancambraia.cleanarchhexagonal.application.ports.out;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
  Optional<Customer> find(String id);
}
