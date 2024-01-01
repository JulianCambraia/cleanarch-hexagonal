package br.com.juliancambraia.cleanarchhexagonal.adapters.in.controllers.response;

import lombok.Data;

@Data
public class CustomerResponse {
  private String name;
  private String cpf;
  private AddressResponse address;
  private Boolean isValidCpf;
}
