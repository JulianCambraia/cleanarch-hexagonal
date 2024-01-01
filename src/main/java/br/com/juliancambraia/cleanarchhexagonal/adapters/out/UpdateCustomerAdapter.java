package br.com.juliancambraia.cleanarchhexagonal.adapters.out;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.CustomerRepository;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {
  
  private final CustomerRepository customerRepository;
  private final CustomerEntityMapper customerEntityMapper;
  
  public UpdateCustomerAdapter(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
    this.customerRepository = customerRepository;
    this.customerEntityMapper = customerEntityMapper;
  }
  
  @Override
  public void update(Customer customer) {
    var customerEntity = customerEntityMapper.toCustomerEntity(customer);
    customerRepository.save(customerEntity);
  }
}
