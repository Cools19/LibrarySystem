package com.Libary.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Libary.model.BookAllocation;

public interface IBookAllocationRepository extends JpaRepository <BookAllocation, Integer> {

	public BookAllocation findByBookId(Integer id);

}
