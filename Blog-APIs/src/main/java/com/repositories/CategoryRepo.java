package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
