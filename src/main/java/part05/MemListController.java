package part05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러는 컨트롤러라고 명시 ->dispatcher-web.xml에 컨트롤러 빈 선언!!
@Controller
public class MemListController {
	private MemDAO dao; //다오를 참조할것이기 때뮤네,,
	
	//무인자 생성자..
	public MemListController() {
		// TODO Auto-generated constructor stub
	}

	//dao값을 property값으로 넣어줄거기때문에 받을 setter메소드 만들기
	public void setDao(MemDAO dao) {
		this.dao = dao;
	}
	
	
	
	@RequestMapping("/memList.htm")
	public ModelAndView list() { //()인자값안에 없는이유는 그냥 select로 결과값만 받아오는거니까.
		//모델앤드뷰 객체생성..
		ModelAndView mav = new ModelAndView();
		mav.addObject("aList",dao.list()); //aList라는 이름으로 다오리스트에서 리턴해준 값을 받았다.
		//리스트를 받아오기 위해서 다오에있는 리스트메소드를 오버라이딩하고 그안에다가
		//맵퍼에있는 쿼리문을 받아오기 위해 (mem.all)로 연결한 거니까!
		mav.setViewName("view/part05/memList"); 
		//dispatcher-web을 들려서 앞에랑 뒤에 붙여서 나간다.
		return mav;
	}//end list

}//end MemListController
