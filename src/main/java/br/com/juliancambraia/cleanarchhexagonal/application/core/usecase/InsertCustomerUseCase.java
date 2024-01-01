package br.com.juliancambraia.cleanarchhexagonal.application.core.usecase;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.InsertCustomerOutPutPort;

public class InsertCustomerUseCase {
  
  private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
  private final InsertCustomerOutPutPort insertCustomerOutPutPort;
  
  public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutPutPort insertCustomerOutPutPort) {
    this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
    this.insertCustomerOutPutPort = insertCustomerOutPutPort;
  }
  
  public void insert(Customer customer, String zipCode) {
    var address = findAddressByZipCodeOutputPort.find(zipCode);
    customer.setAddress(address);
    
    insertCustomerOutPutPort.insert(customer);
  }
}
