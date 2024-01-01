package br.com.juliancambraia.cleanarchhexagonal.application.core.usecase;

import br.com.juliancambraia.cleanarchhexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {
  
  private final FindCustomerByIdInputPort findCustomerByIdInputPort;
  private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;
  
  public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
    this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
  }
  
  @Override
  public void delete(String id) {
    findCustomerByIdInputPort.find(id);
    
    deleteCustomerByIdOutputPort.delete(id);
  }
}
