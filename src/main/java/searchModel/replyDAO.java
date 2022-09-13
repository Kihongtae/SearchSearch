package searchModel;

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

}
