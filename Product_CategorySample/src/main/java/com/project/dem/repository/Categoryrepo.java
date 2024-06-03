package com.project.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dem.entity.Category;
@Repository
public interface Categoryrepo extends JpaRepository<Category, Long> {
}


