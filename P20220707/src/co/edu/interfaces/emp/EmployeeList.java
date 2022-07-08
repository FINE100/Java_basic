package co.edu.interfaces.emp;

public interface EmployeeList {

	
	// 초기화
	public void init();
	
	
	//사원정보 입력.
	public void input();
	
	// 사번에 해당하는 정보 조회.
	public Employee search(int empId);
		
	
	
	// 전체 출력.
	public void printList();
	

}


