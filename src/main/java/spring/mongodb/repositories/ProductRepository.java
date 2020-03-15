package spring.mongodb.repositories;

import org.springframework.data.repository.CrudRepository;

import spring.mongodb.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
