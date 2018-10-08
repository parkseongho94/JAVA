package eip.mvc.model.service;

import java.sql.SQLException;

import eip.mvc.model.dao.LoginDAO;
import eip.mvc.model.dao.LoginDAOImpl;
import eip.mvc.model.dto.UserVO;

public class LoginServiceImpl implements LoginService {

	private LoginDAO dao = new LoginDAOImpl();
	
	@Override
	public int insertAccount(String id, String pwd) throws SQLException {
		int result = dao.insertAccount(id, pwd);
		return result;
		//return dao.insertAccount(id, pwd);
	}

	@Override
	public UserVO selectByIdPwd(String id, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		
		UserVO result = dao.selectByIdPwd(id, pwd);
		
		return result;
	}

}
