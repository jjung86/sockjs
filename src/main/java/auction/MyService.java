package auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	private MyDao dao;
	
	public String selectNow(){
		return dao.selectNow();
	}//controller에 가까운역할
}
