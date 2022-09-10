package com.Libary.service;

import java.util.List;
import java.util.Optional;

import com.Libary.model.BookAllocation;

public interface IBookAllocationService {
	Integer saveBookAllocation(BookAllocation bookAllocation);
	public List<BookAllocation> getAllBookAllocation();
	public void deleteBookAllocation(Integer id);
	public BookAllocation updateBookAllocation(BookAllocation bookAllocation, Integer id) ;
	public void deleteAll();
	Optional<BookAllocation> getBookAllocation(Integer id);

}
