package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	private String coachName;
	private String lockerName;
	
	
	public SoccerMember(int memberId, String memberName, String phone, String coachName,String lockerName) {
	super(memberId,memberName,phone);
	this.coachName = coachName;
	this.lockerName = lockerName;	
	
		
	
	}


	@Override
	public String toString() {		
		return "SoccerMember [아이디 =" + getMemberId() + ", 이름 =" + getMemberName() + ", 연락처=" + getPhone()+", 코치 이름 =" + coachName + ", 락커룸 이름 =" + lockerName+ "]";
	}


	@Override
	public void showInfo() {
		// 코치이름, 락커룸 이름
		super.showInfo();
		System.out.printf("코치이름 : %8s  락커룸 이름 : %8s\n", coachName, lockerName);
	}
	
	
	
	
	
	
	
}
