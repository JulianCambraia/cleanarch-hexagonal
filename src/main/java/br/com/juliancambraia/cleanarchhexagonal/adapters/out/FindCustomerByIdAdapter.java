package br.com.juliancambraia.cleanarchhexagonal.adapters.out;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.CustomerRepository;
import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {
  
  private final CustomerRepository customerRepository;
  private final CustomerEntityMapper customerEntityMapper;
  
  public FindCustomerByIdAdapter(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
    this.customerRepository = customerRepository;
    this.customerEntityMapper = customerEntityMapper;
  }
  
  @Override
  public Optional<Customer> find(String id) {
    var customerEntity = customerRepository.findById(id);
    
    return customerEntity.map(customerEntityMapper::toCustomer);
  }
}
