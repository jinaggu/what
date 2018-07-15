package part04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller    //컨트롤러 명시했으면!!!! dispatcher-web.xml에 등록하자!!
public class HelloCommandController {
	
	@RequestMapping(value="/mem.htm",method=RequestMethod.GET) //또하나의 속성을 추가시켜준다. 
	//그 화면의 값을 들고 다음화면으로 넘길때는~~ url앞에 value를 써준다!!
	public String form() {
		return "view/part04/memForm";
	}//end form()//
	
	//value 속성을 지정해주는것은 
	//url이 똑같은게 두개가 있어도 메소드가 get, post로 서로 다르면 value, method를 지정함으로써 
	//똑같은 url을 사용할수 있게 해준다.
	/*@RequestMapping(value="/mem.htm",method=RequestMethod.POST) //url아예 그냥 다르게 하면 넘어가진다
	public ModelAndView submit(String name, int age) { //
		//memForm.jsp에 있는 name속성과 똑같아야 한다 name="name" ""이것
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name); //다음페이지에 써줄 ${name} 이부부분은 첫분째 부분, 두번째는 받아오는 값
		mav.addObject("age",age);
		mav.setViewName("view/part04/memPro"); //페이지를 이동시켜주는것~~~
		return mav;
	}//end submit()//*/
	
	/*@RequestMapping(value="/mem.htm",method=RequestMethod.POST)
	public String submit(MemDTO dto) { //"name"이 DTO클래스로 넘어가서 SET메소드로 name을 받고 멤버변수에 값을 할당해준다 그 값이 저장되어
		                               //${dto.name}하면 값이 넘어오는 것
		//그냥 받아오는 값의 타입을 dto로 해놓으면 memDTO에 있는 멤버변수(=컬럼명)와 memForm.jsp의 name="name" 
		//"name"부분과 똑같이 해놓으면 자동적으로 넘어가서 ${dto.name} 이렇게 써주면 값이 출력이 된다
		return "view/part04/memPro";
	}//end submit()//*/
	
	//post방식으로 요청이 들어왔을때.
	@RequestMapping(value="/mem.htm",method=RequestMethod.POST)
	public String submit(@ModelAttribute("dd")MemDTO dto) {
		return "/view/part04/memPro";  //@ModelAttribute("") ""여기에 별칭을 지정해줄수도 있다.
	}//end submit()//
	
}//end class//
