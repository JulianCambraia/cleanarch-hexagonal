package br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository;

import br.com.juliancambraia.cleanarchhexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
