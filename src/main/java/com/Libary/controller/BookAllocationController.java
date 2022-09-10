package com.Libary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Libary.model.BookAllocation;
import com.Libary.service.IBookAllocationService;

@RestController
public class BookAllocationController {

	
	@RequestMapping("/hi")
	public String Hey() {
	return "hello";
}

	
	
	
	@Autowired
	IBookAllocationService bookAllocationService;
	


 @PostMapping("/bookAllow")
 Integer createBookAllocation(@RequestBody BookAllocation bookAllocation ) {
	 Integer id = bookAllocationService.saveBookAllocation(bookAllocation);
	 System.out.println(id);
	 return id;
 }
 
 @GetMapping("/allBookAllocation")
 public List<BookAllocation> getBookAllocation(){
	 return bookAllocationService.getAllBookAllocation();
 }
 
 @DeleteMapping("/deleteAllBook")
 public String deleteAllEmployees(){
	bookAllocationService.deleteAll();
	return "Deleted all bookAllocation";
 }
	 
	 
 @GetMapping("/getbookAllocation/{id}")
 public Optional<BookAllocation> getBookAllocation(@PathVariable Integer id){
	 Optional<BookAllocation> bookAllocation = bookAllocationService.getBookAllocation(id);
	 return bookAllocation; 
 }
 
 @DeleteMapping ("/deletebookAllocation/{id}")
 public ResponseEntity<BookAllocation> deleteEmployee(@PathVariable Integer id){
	 System.out.println(id);
	 ResponseEntity<BookAllocation> responseEntity = new ResponseEntity<>(HttpStatus.OK);
	 
			 try {
				 bookAllocationService.deleteBookAllocation(id);
			 }
	 		catch(Exception e) {
	 			e.printStackTrace();
	 			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 		}
	 return responseEntity;
 }
 
 @PutMapping("/updateBookAllocation/{id}")
 public ResponseEntity<BookAllocation> updateBookAllocation(@PathVariable("id") Integer id, @RequestBody BookAllocation bookAllocation){
	 return new ResponseEntity<BookAllocation>(bookAllocationService.updateBookAllocation(bookAllocation,id),HttpStatus.OK);
	 
 }
 
 
 
}
