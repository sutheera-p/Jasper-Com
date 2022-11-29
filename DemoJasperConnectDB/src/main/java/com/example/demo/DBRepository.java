package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DBRepository extends JpaRepository<ModelDB, Long> {
	ModelDB findAllById(long Id);
	List<ModelDB> findAllByOrderByIdDesc();
}
