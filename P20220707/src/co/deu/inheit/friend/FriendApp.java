package co.deu.inheit.friend;

import java.util.Scanner;

/*
 * 등록, 목록, 조회
 */

public class FriendApp {
	// 생성자 기본 생성자 사용.

	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
			
//			System.out.println(" 1.등록 | 2. 조회 | 3. 목록 | 9.종료 ");
			timerShow(" 1.등록 | 2. 조회 | 3. 목록 | 9.종료 ");
			System.out.print("선택 > ");
			int selectNo = 0;

			try {
				selectNo = Integer.parseInt(scn.nextLine()); // "가" -> 12 예외처리
			} catch (Exception e) {
				timerShow("숫자만 입력하세요");
//				System.out.println("숫자만 입력하세요");

			}

			if (selectNo == 1) {
				add();

			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				
				timerShow("숫자만 입력하세요");
//				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램을 종료.");

	} // end of start()

	private void add() {

		int choice = 0;

		while (true) { // 반복문을 넣어야 잘못 입력시 다시 돌아오므로 사용
			timerShow("1. 학교 2. 회사 3. 친구");
//			System.out.println("1. 학교 2. 회사 3. 친구");
			System.out.print("선택 > ");

			try {
				choice = Integer.parseInt(scn.nextLine());
				break; // 반복문을 빠져나오세요
			} catch (Exception e) {
				timerShow("1번, 2번, 3번 중에 선택하세요");
//				System.out.println("1번, 2번, 3번 중에 선택하세요");
			}
		}

		System.out.println("이름> ");
		String name = scn.nextLine();
		System.out.println("연락처> ");
		String phone = scn.nextLine();

		if (choice == 1) {
			System.out.print("학교이름 > ");
			String univ = scn.nextLine();
			System.out.print("전공 > ");
			String major = scn.nextLine();

			friends[friendNum++] = new UnivFriend(name, phone, univ, major);

		} else if (choice == 2) {
			System.out.print("회사이름 > ");
			String company = scn.nextLine();
			System.out.print("부서이름 > ");
			String department = scn.nextLine();

			friends[friendNum++] = new ComFriend(name, phone, company, department);

		} else if (choice == 3) {
			friends[friendNum++] = new Friend(name, phone);// 자동형변환 일어남

		}

	}

	private void search() {
		// 친구이름 입력 => 친구상세정보 : showInfo()
		timerShow("찾을 이름을 입력하세요");
//		System.out.println("찾을 이름을 입력하세요");
		String fName = scn.nextLine();

		for (int i = 0; i < friendNum; i++) {
			if (friends[i].getName().equals(fName)) {
				friends[i].showInfo();
			}
		}

	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}

	private void timerShow(String msg) {
		String[] message = msg.split("");
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100); //100 밀리세컨 = 0.1초동안 멈추세요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}