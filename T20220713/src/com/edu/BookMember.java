package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
	
	private String presidentName;
	private String className;
	

	public BookMember(int memberId, String memberName, String phone, String presidentName,String className) {
	super(memberId, memberName, phone);
	this.presidentName = presidentName;
	this.className = className;
	}

	@Override
	public String toString() {
		return "BookMember [아이디 =" + getMemberId() + ", 이름 =" + getMemberName() + ", 연락처=" + getPhone() + "도서반장" + presidentName + ", 강의실 이름 =" + className + "]";
	}

//	@Override
//	public void showInfo() {
//		// 도서반장, 강의실이름
//		super.showInfo();
//		System.out.printf("도서반장 : %8s  강의실 : %8s\n", presidentName, className);
	}


	

	
	
	
	
	
	


	
	
	
	

