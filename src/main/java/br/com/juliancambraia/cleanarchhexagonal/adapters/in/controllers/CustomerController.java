package br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers;

import br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.mapper.CustomerMapper;
import br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.request.CustomerRequest;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
  
  private final InsertCustomerInputPort insertCustomerInputPort;
  private final CustomerMapper customerMapper;
  
  public CustomerController(InsertCustomerInputPort insertCustomerInputPort, CustomerMapper customerMapper) {
    this.insertCustomerInputPort = insertCustomerInputPort;
    this.customerMapper = customerMapper;
  }
  
  @PostMapping
  public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest, String zipCode) {
    var customer = customerMapper.toCustomer(customerRequest);
    insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
    
    return ResponseEntity.ok().build();
  }
}
