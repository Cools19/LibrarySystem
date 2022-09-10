package com.Libary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Libary.model.BookAllocation;

@Service
public class BookAllocationServiceImpl implements  IBookAllocationService {

	@Autowired
	IBookAllocationRepository bookAllocationRepository;
	
	@Override
	public Integer saveBookAllocation(BookAllocation bookAllocation) {
		BookAllocation savedBookAllocation = bookAllocationRepository.save(bookAllocation);
		return savedBookAllocation.getBookId();
	}
	
	@Override
	public List<BookAllocation> getAllBookAllocation(){
		return bookAllocationRepository.findAll();
	}
	
	@Override
	public Optional<BookAllocation> getBookAllocation(Integer id){
		return bookAllocationRepository.findById(id);
	}
	
	@Override
	public void deleteBookAllocation(Integer id) {
		bookAllocationRepository.deleteById(id);
	}
	
	@Override
	public BookAllocation updateBookAllocation(BookAllocation bookAllocation, Integer bookId) {
		// we check weather the employee exists with the given id or not
		BookAllocation existingBookAllocation = bookAllocationRepository.findByBookId(bookId);
				
				existingBookAllocation.setBookId(bookAllocation.getBookId());
				existingBookAllocation.setStudentId(bookAllocation.getStudentId());
				existingBookAllocation.setAllocationDate(bookAllocation.getAllocationDate());
				existingBookAllocation.setStatusDes(bookAllocation.getStatusDes());
				
				
				//we will update the value and then save the updated value
				bookAllocationRepository.save(existingBookAllocation);
				return existingBookAllocation;
				
				
	
	}

	@Override
	public void deleteAll() {
		bookAllocationRepository.deleteAll();
		
	}

	}



