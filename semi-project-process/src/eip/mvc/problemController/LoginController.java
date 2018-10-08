package eip.mvc.problemController;

import eip.mvc.model.dto.UserVO;
import eip.mvc.model.service.LoginService;
import eip.mvc.model.service.LoginServiceImpl;

public class LoginController {

	
	private static LoginService service = new LoginServiceImpl();
	public static void insertAccount(String id, String pwd) {
		try {
		service.insertAccount(id, pwd);//메인뷰의 입력값을 받아옴 
		
		System.out.println("가입이 완료되었습니다.");
		
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
		System.out.println("로그인 완료되었습니다.");
		System.out.println(user);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return user;
	}
	
}
