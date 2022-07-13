package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	private String teacherName;
	private String grade;
	
	public SwimMember(int memberId, String memberName, String phone,String teacherName,String grade) {
		super(memberId, memberName, phone);
		this.teacherName = teacherName;
		this.grade=grade;
		
	}

	@Override
	public String toString() {
		return "SoccerMember [아이디 =" + getMemberId() + ", 이름 =" + getMemberName() + ", 연락처=" + getPhone()+", 강사 이름 =" + teacherName + ", 수영 등급 =" + grade + "]";
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf("강사 이름 : %8s  수영 등급 : %8s\n", teacherName, grade);
		
	}

	
	
	
	
		
	
	}

