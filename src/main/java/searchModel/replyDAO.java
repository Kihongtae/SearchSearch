package searchModel;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import searchDB.SqlSessionManager;

public class replyDAO {
	private SqlSessionFactory sqlSessionFactory = new SqlSessionManager().getSqlSession();

	public int addReply(replyDTO dto) {

		SqlSession session = sqlSessionFactory.openSession(true);
		int row = session.insert("addReply", dto);
		
		session.close();
		return row;

	}
	public List<replyDTO> showReply(int clNum) {
		SqlSession session = sqlSessionFactory.openSession(true);

		List<replyDTO> dto = (List) session.selectList("showReply", clNum);
		session.close();
		return dto;
	}

}
