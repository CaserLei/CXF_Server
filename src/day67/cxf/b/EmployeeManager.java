package day67.cxf.b;

import java.util.List;

import day67.cxf.bean.Employee;

public interface EmployeeManager {

	void add(Employee employee);

	List<Employee> query();

}