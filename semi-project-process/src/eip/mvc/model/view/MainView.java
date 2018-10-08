package eip.mvc.model.view;

import java.util.Scanner;

import eip.mvc.model.dto.UserVO;
import eip.mvc.problemController.LoginController;

public class MainView {
	static Scanner sc = new Scanner(System.in);
	static UserVO user = new UserVO();
	
	public static void main(String[] args) {
		//로그인 구현
		
		while(true) {
			System.out.println("------------------- 선택 -------------------");
			System.out.println("1. 회원가입 2. 로그인 3. 문제유형별 풀기, 4. 문제삭제하기, 5. 공지사항, 6. 나가기");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) { 
			// 컨트롤러에게 요청
			
			case 1: createAccout(); break;
			case 2: loginAccount(); break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: 
				System.out.println("프로그램 종료");
				System.exit(0);
			}// switch
		}// while
	}
	public static void createAccout() { //회원가입 기능
		System.out.println("id를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀 번호를 입력해 주세요 : ");
		String pwd = sc.nextLine();
		LoginController.insertAccount(id, pwd); //LoginController로 이동
	}
	
	public static void loginAccount() { //로그인 기능
		
		System.out.println("id를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀 번호를 입력해 주세요 : ");
		String pwd = sc.nextLine();
		MainView.user = LoginController.selectByIdPwd(id, pwd); //LoginController.selectByIdPwd로 이동
	}
}







