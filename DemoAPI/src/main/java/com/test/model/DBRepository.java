package com.test.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DBRepository extends JpaRepository<DbModel, Long> {
	DbModel findAllById(long Id);
	List<DbModel> findAllByOrderByIdDesc();
}
