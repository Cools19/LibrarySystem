package com.Libary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookAllocation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private int studentId;
	private String allocationDate;
	private String statusDes;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getAllocationDate() {
		return allocationDate;
	}
	public void setAllocationDate(String allocationDate) {
		this.allocationDate = allocationDate;
	}
	public String getStatusDes() {
		 return statusDes;
	}
	public void setStatusDes(String statusDes) {
		 this.statusDes = statusDes;
	}
	public BookAllocation(int bookId, int studentId, String allocationDate, String statusDes) {
		super();
		this.bookId = bookId;
		this.studentId = studentId;
		this.allocationDate = allocationDate;
		this.statusDes = statusDes;
	}
	public BookAllocation() {
		super();
	}
	
	
	
}