package co.edu.emp;

import java.util.Scanner;

/* 배열, 부서초기화, 입력, 조회, 전체출력
 * 저장, 등록, 조회, 리스트....
 */
public class EmployeeList {
	// 싱글톤.

	private static EmployeeList instance = new EmployeeList();

	private EmployeeList() {

	}

	public static EmployeeList getInstance() {
		return instance;
	}

	// 배열
	Employee[] list; // 사원 배열
	int empNum; // 몇번째 등록된 사원인지
	Scanner scn = new Scanner(System.in);

	// 배열객체 선언.
	public void init() {
		System.out.println("사원수 입력 > ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	// 사원정보 입력 -> 배열 추가
	public void input() {
		// 배열의 크기보다 더 많이 입력 못하도록...
		if (empNum >= list.length) {
			System.out.println("입력을 초과했습니다.");
			return;// 메소드 실행하지 않고 종료하겠다는 뜻
		}

		System.out.printf("%d 사번 > ", empNum);
		int no = Integer.parseInt(scn.nextLine());

		System.out.println("이름 > ");
		String name = scn.nextLine();

		System.out.printf("급여 > ");
		int sal = Integer.parseInt(scn.nextLine());
		
		System.out.printf("부서번호 > ");
		int dept = Integer.parseInt(scn.nextLine());

		list[empNum++] = new Employee(no, name, sal,dept); // 사원 인스턴스 ..-> 배열저장

	}

	// 전체 출력.
	public void printList() {
		for (int i = 0; i < empNum; i++) { // list[empNum++]에서 하나씩 사원 수가 증가하여 늘어나므로.. 배열 길이 안 쓰고 그대로 씀
			System.out.printf("%5d %10s %7d\n", list[i].getEmloyeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	// 상세조회. 사원의 상세정보를 보여주는 기능 Employee 추가.
	public void search() {
		System.out.println("사원번호를 입력> ");
		int employeeId = Integer.parseInt(scn.nextLine());
		//int cnt
		
		for (int i = 0; i < empNum; i++) {
			if(employeeId == list[i].getEmloyeeId()) {
				System.out.println(list[i].getDetailInfo());
				break;
				
			} //else if 써서 아닌 경우도... 생각해보기 오늘 cnt 써서 했음! 찾아봐봐 ㅠ 
				
			
			
		} System.out.println("");
	}
	//말일 정보.
	private int getLastDate(int mon) {
		switch(mon) {
		case 6: 					//6월
			return 30;
		case 7 : 					//7월
			return 31;
		default:
			return 30;
			
		}
		
	}
	// 1일의 요일정보.
	private int getDayInfo(int mon) {
		switch(mon) {
			case 6:
				return 3; //첫째날 요일정보
			case 7:
				return 5;
			default :
				return 0;
		}
	}
	
	// 달력.

	public void showCalendar() {
		System.out.println("월을 입력 >>>>> ");
		int month = Integer.parseInt(scn.nextLine());
		
		// 요일 정보. 1일의 위치. 말일의 날짜. 
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int firstDay = getDayInfo(month); // 일 : 0, 월 : 1, 화 : 2, 수 : 3, 목 : 4, 금 : 5, 토 : 6,
		int lastDate = getLastDate(month); 
		
		for(int i = 0; i<days.length;i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 요일 정보를 맞추도록.
		for(int i = 0; i <firstDay; i++) {
			System.out.printf("%4s"," ");
		}
		
		
		for(int i = 1; i <= lastDate ; i++) { //루프 돌려야하는 배열이 아닌 실제 date(1,2,3..31)이므로 1부터 시작
			System.out.printf("%4d", i);
			if((i+(firstDay)) % 7 ==0 ) { //토요일까지 출력했으면 줄 바꿈
				System.out.println();
			}
		}   
		System.out.println();
	}


}
