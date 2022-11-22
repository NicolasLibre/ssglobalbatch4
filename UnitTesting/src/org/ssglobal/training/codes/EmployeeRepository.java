package org.ssglobal.training.codes;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeRepository {
	private List<Employee> employeetbl;
	
	public EmployeeRepository(List<Employee> employeeTbl) {
		this.employeetbl = employeeTbl;
	}
	
	//CRUD Transactions
	
	public List<Employee> getEmployees(){
		return this.employeetbl;
	}
	
	public Stream<Employee> getEmployeeStream(){
		return this.employeetbl.stream();
	}
}
