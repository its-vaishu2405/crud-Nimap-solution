package com.project.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dem.entity.Product;
@Repository
public interface Productrepo extends JpaRepository<Product, Long> {
}
