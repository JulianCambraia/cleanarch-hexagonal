package br.com.juliancambraia.cleanarchhexagonal.application.core.usecase;

import br.com.juliancambraia.cleanarchhexagonal.application.core.domain.Customer;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.InsertCustomerOutPutPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
  
  private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
  private final InsertCustomerOutPutPort insertCustomerOutPutPort;
  
  private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;
  
  public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutPutPort insertCustomerOutPutPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
    this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
    this.insertCustomerOutPutPort = insertCustomerOutPutPort;
    this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
  }
  
  @Override
  public void insert(Customer customer, String zipCode) {
    var address = findAddressByZipCodeOutputPort.find(zipCode);
    customer.setAddress(address);
    
    insertCustomerOutPutPort.insert(customer);
    // enviar cpf para a fila do kafka
    sendCpfForValidationOutputPort.send(customer.getCpf());
  }
}
