package eip.mvc.model.view;

import java.util.Scanner;

import eip.mvc.model.dto.UserVO;
import eip.mvc.problemController.LoginController;

public class MainView {
	static Scanner sc = new Scanner(System.in);
	static UserVO user = new UserVO();
	
	public static void main(String[] args) {
		//�α��� ����
		
		while(true) {
			System.out.println("------------------- ���� -------------------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���������� Ǯ��, 4. ���������ϱ�, 5. ��������, 6. ������");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) { 
			// ��Ʈ�ѷ����� ��û
			
			case 1: createAccout(); break;
			case 2: loginAccount(); break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: 
				System.out.println("���α׷� ����");
				System.exit(0);
			}// switch
		}// while
	}
	public static void createAccout() { //ȸ������ ���
		System.out.println("id�� �Է����ּ��� : ");
		String id = sc.nextLine();
		System.out.println("��� ��ȣ�� �Է��� �ּ��� : ");
		String pwd = sc.nextLine();
		LoginController.insertAccount(id, pwd); //LoginController�� �̵�
	}
	
	public static void loginAccount() { //�α��� ���
		
		System.out.println("id�� �Է����ּ��� : ");
		String id = sc.nextLine();
		System.out.println("��� ��ȣ�� �Է��� �ּ��� : ");
		String pwd = sc.nextLine();
		MainView.user = LoginController.selectByIdPwd(id, pwd); //LoginController.selectByIdPwd�� �̵�
	}
}







