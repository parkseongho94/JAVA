package eip.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import eip.mvc.model.dto.NoticeVO;

public interface ProblemService {
	
	public int insertNotice(NoticeVO notice) throws SQLException;
	
	public List<NoticeVO> selectAll() throws SQLException;
}
