package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee1;
import com.capgemini.day4.President;
import com.capgemini.day4.SalesManager;

class Employee1Test {

	
		Employee1 empl1=new President(1234,"ABC",10);
		Employee1 empl2=new SalesManager(9876,"XYZ");;
	
	
	
	@Test
	void testEmployee1() {
		
		
		assertEquals(12040, empl1.calculateNetSalary(7000));
		empl1.displayDetails();
		assertEquals(11640, empl2.calculateNetSalary(7000));
		empl2.displayDetails();
		
	}
	
		
		
	}


