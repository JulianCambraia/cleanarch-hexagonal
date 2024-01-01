package br.com.juliancambraia.cleanarchhexagonal.application.core.usecase;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase {
  private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
  
  public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
    this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
  }
  
  public Customer find(String id) {
    return findCustomerByIdOutputPort.find(id)
        .orElseThrow(() -> new RuntimeException("Customer not found."));
  }
}
