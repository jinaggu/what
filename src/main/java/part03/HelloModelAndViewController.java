package part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러라고 명시 -> dispatcher-web에 등록 컨트롤러 빈등록 클래스로~
@Controller
public class HelloModelAndViewController {
	
	//리턴타입 ModelAndView!!!!
	@RequestMapping("/helloModelAndView.htm")
	public ModelAndView search() {
		ModelAndView mav = new ModelAndView();
		//뷰에 사용될 정보를 담는다.
		mav.addObject("name","kim");
		mav.addObject("age",34);
		
		//view에 보여질 jsp화면 넣는건 setviewname!!!!!
		mav.setViewName("view/part03/helloModelAndView");
		//뷰페이지에 ("name","kim"),("age",34)정보를 넘긴다.
		return mav;
	}//end search()//

}//end class//
