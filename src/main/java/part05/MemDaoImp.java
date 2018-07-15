package part05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class MemDaoImp implements MemDAO{
	private SqlSessionTemplate sqlSession;
	
	//무인자 생성자만들어줌
	public MemDaoImp() {
		
	}
	
    //dispatcher-web.xml에서 
	//property값으로 받을것이기 때문에 sqlSession셋터!메소드를 만들어놓는다
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<MemDTO> list() {
		return sqlSession.selectList("mem.all");
	}

	@Override
	public void insertMethod(MemDTO dto) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}//end class
