package com.offs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	@Test
	public void sayHello() {
		
		Employee emp=new Employee();
		String expected=emp.sayHello();
		String actual="Hello";
		assertEquals(expected, actual);
		
	}

}
