package br.com.juliancambraia.cleanarchhexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {
  
  void send(String cpf);
}
