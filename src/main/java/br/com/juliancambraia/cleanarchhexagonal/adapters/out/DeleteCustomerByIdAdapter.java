package br.com.juliancambraia.cleanarchhexagonal.adapters.out;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.CustomerRepository;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {
  
  private final CustomerRepository customerRepository;
  
  public DeleteCustomerByIdAdapter(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }
  
  @Override
  public void delete(String id) {
    customerRepository.deleteById(id);
  }
}
