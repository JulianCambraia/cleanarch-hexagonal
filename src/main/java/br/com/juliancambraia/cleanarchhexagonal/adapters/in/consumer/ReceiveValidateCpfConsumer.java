package br.com.juliancambraia.cleanarchhexagonal.adapters.in.consumer;

import br.com.juliancambraia.cleanarchhexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.juliancambraia.cleanarchhexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.juliancambraia.cleanarchhexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {
  
  private final UpdateCustomerInputPort updateCustomerInputPort;
  private final CustomerMessageMapper customerMessageMapper;
  
  public ReceiveValidateCpfConsumer(UpdateCustomerInputPort updateCustomerInputPort, CustomerMessageMapper customerMessageMapper) {
    this.updateCustomerInputPort = updateCustomerInputPort;
    this.customerMessageMapper = customerMessageMapper;
  }
  
  @KafkaListener(topics = "tp-cpf-validated", groupId = "cambraia")
  public void receive(CustomerMessage customerMessage) {
    var customer = customerMessageMapper.toCustomer(customerMessage);
    updateCustomerInputPort.update(customer, customerMessage.getZipCode());
  }
}
