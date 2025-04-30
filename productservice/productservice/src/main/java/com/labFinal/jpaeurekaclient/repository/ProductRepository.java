package com.labFinal.jpaeurekaclient.repository;

import com.labFinal.jpaeurekaclient.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
