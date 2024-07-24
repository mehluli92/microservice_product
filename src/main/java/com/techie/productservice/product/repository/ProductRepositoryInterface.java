package com.techie.productservice.product.repository;

import com.techie.productservice.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositoryInterface extends MongoRepository<Product, String> {
}
