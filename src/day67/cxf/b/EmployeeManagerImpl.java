package day67.cxf.b;

import java.util.ArrayList;
import java.util.List;

import day67.cxf.bean.Employee;

public class EmployeeManagerImpl implements EmployeeManager {
	private List<Employee> employees=new ArrayList<Employee>();
	
	/* (non-Javadoc)
	 * @see day67.cxf.b.EmployeeManager#add(day67.cxf.bean.Employee)
	 */
	@Override
	public void add(Employee employee){
		//添加到集合中
		employees.add(employee);
	}
	
	/* (non-Javadoc)
	 * @see day67.cxf.b.EmployeeManager#query()
	 */
	@Override
	public List<Employee> query(){
		return employees;
	}

}
