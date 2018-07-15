package part05;

import java.util.List;

public interface MemDAO { //리스트를 뿌려주기 위한 인터페이스이다. 
	//메소드로 리턴타입이 list<MemDTO>를 만들자.
	public List<MemDTO> list();
	public void insertMethod(MemDTO dto); 
	//이메소드를 호출할때 memDTO타입의 인자값을 받는다.

}//end interface
