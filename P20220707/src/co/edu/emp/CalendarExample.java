package co.edu.emp;

import java.util.Calendar;

/*
 * Calendar 클래스 연습.
 */
public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1+ "월");		// 1 더하는 이유: 캘린터 클래스는 0이 시작점.(0~11) => 1더 해서 맞춰줌
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); // 일 :1, 월 : 2, 화 : 3, 수 : 4, 목 : 5, 금 : 6, 토 : 7
		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일"); // 말일 날짜.
	
		cal.set(2022, 5, 1); //2022년 6월 1일 지정	
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1+ "월");		// 1 더하는 이유: 캘린터 클래스는 0이 시작점.(0~11) => 1더 해서 맞춰줌
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); // 일 :1, 월 : 2, 화 : 3, 수 : 4, 목 : 5, 금 : 6, 토 : 7
		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일"); // 말일 날짜.
	
//		int year = 2022;
//		int month = 8;
//		
//		
//		System.out.printf("%d년 %d월의 마지막 날짜는 %d\n",  year, month, getLastDate(year, month));
//		System.out.printf("%d년 %d월의 1일 요일정보는",  year, month, getDayInfo(year, month));
//		
	
	
	}
	
	// 년, 월 정보 => 해당 년, 월의 말일 정보 (메소드) 2022년 9월
	
	
	public int getLastDate(int year, int month) {
	
		Calendar cal =Calendar.getInstance();
		cal.set(year, month -1, 1);					// month - 1 하는 이유 : 
													// 월이 0~11로 설정 되어 있으므로 입력값을 9월로 출력하려면 -1 해서 8이 되어야 함
		
		return cal.getActualMaximum(Calendar.DATE); // 말일 정보를 가져오기
		
		
	}
	
	// 년, 월 정보 => 해당 년, 월의 1일의 정보 (메소드)
	public int getDayInfo(int year, int month) {
		
		Calendar cal =Calendar.getInstance();
		cal.set(year, month -1, 1);		
		
		return cal.getMinimum(Calendar.DATE);
		
		
		
		
	}
		
	}
