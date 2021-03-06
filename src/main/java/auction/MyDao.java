package auction;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {

	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	private String namespace = "io.vertx.app.mapper";
	
	public String selectNow() {
		return sqlSession.selectOne(namespace+".selectNow");
	}
}
