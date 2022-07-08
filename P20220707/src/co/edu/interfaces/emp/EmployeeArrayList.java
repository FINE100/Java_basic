package co.edu.interfaces.emp;
import java.util.ArrayList;

/*
 * 컬렉션 기반으로 구현
 */

public class EmployeeArrayList implements EmployeeList {

	ArrayList<Employee> list;
	int EmpNum; //필요없음 사원 수 초기화도 필요 없음
	
	@Override
	public void init() {
		
		
	}
	@Override
	public void input() {
		
		
	}
	@Override
	public Employee search(int empId) {
		
		return null;
	}
	@Override
	public void printList() {
	
		
	}
}