package eip.mvc.model.dao;

import java.util.List;

import eip.mvc.model.dto.ResultVO;

public interface ResultDAO {
	
	/**
	 * @return : List<Result> �����ȸ 
	 */
	public List<ResultVO> selectAll();

	
	/**
	 * @Param : Result - ä�� ����ؼ� ����
	 * @return : int  ����� ����
	 */
	public int insertResult(ResultVO result);
	
}
