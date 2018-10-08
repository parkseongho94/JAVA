package eip.mvc.problemController;

import eip.mvc.model.dto.UserVO;
import eip.mvc.model.service.LoginService;
import eip.mvc.model.service.LoginServiceImpl;

public class LoginController {

	
	private static LoginService service = new LoginServiceImpl();
	public static void insertAccount(String id, String pwd) {
		try {
		service.insertAccount(id, pwd);//���κ��� �Է°��� �޾ƿ� 
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/*public UserVO selectByIdPwd(String id, String pw) {
		return new LoginDAO().selectByIdPwd(id,pw);
		
	}*/
	public static UserVO selectByIdPwd(String id, String pwd) {
		UserVO user = new UserVO();
		try {
		 user = service.selectByIdPwd(id, pwd);
		System.out.println("�α��� �Ϸ�Ǿ����ϴ�.");
		System.out.println(user);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return user;
	}
	
}
