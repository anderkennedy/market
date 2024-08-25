package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Page<Product> getAll(Pageable pageable);
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save (Product product);
    void delete(int productId);
}
