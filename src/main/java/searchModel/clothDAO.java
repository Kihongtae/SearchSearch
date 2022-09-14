package searchModel;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import searchDB.SqlSessionManager;

public class clothDAO {
	private SqlSessionFactory sqlSessionFactory = new SqlSessionManager().getSqlSession();

	public List<clothDTO> show(clothDTO dto) {

		SqlSession session = sqlSessionFactory.openSession(true);
		
		List<clothDTO> clothList =  session.selectList("show", dto);

		session.close();
		return clothList;

	}
}
