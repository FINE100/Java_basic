package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BoardApp {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.리스트 | 6.종료");
			System.out.println("선택>");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0))
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("글 작성자 이름을 입력하세요.");
				String writer = scn.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);

				// 배열의 비어있는 위치에 저장함.
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board; // 비어있는 위치에 한 건 저장
						break;
					}
				}
				System.out.println();
// 전체리스트
			} else if (selectNo == 2) {
				// 게시글 조회 : 제목조회
				System.out.println("조회할 제목을 입력하세요. >");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("============ 글 목록 =================");
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시는 %s, 조회수 %d\n ", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());
						System.out.println("======================================");
						// 카운트 증가.
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					}
				}

			} else if (selectNo == 3) {
				// 제목 조회 후 글내용 수정, 작성자는 그대로 유지
				System.out.println("수정할 게시글의 제목을 입력하세요. >");
				String findTitle = scn.nextLine();
				
				
						
				for (int i = 0; i < boards.length; i++) {
					if (boards[i].getTitle().equals(findTitle)) {
						System.out.println("수정할 내용을 입력하세요. >");
						String getContent = scn.nextLine();
						
						
						
					}  
				}
				
			
			} else if (selectNo == 4) {
				// 같은 제목 조회해서 삭제
				System.out.println("삭제할 제목을 입력하세요. >");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						boards[i] = null;
					}
				}

				System.out.println("정상적으로 삭제되었습니다.");

			} else if (selectNo == 5) {
				for (int i = 0; i < boards.length; i++) {

					if (boards[i] != null) {
						System.out.println("============ 글 목록 =================");
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시는 %s, 조회수 %d\n ", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());
						System.out.println("======================================");

					}
				}

			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
