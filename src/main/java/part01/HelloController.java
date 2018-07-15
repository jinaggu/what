package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//    http://localhost:8090/myweb/hello.htm

//컨트롤러로써 어노테이션으로 명시
@Controller
public class HelloController {
	
	//그 안에 메소드 만듬 요청받은 url와 맵핑할것 (그리고 dispatcher-web을 거쳐서 /WEB-INF/ , .jsp붙여서 그 뷰페이지로 보여짐)
	//리턴해주기 위해서 리턴타입을 String 으로
	//리퀘스트맵핑을 꼭 어노테이션으로 명시해준다. () 가로안에 그 url로 쓰일 url을 써준다.!!
	@RequestMapping("/hello.htm")
	public String search() {
		return "view/part01/hello"; 
		//이걸 리턴해주지만 이것은 완전한 url정보가 아니다. 
		//리턴해주고 거기에서 dispatcher-web을 거쳐서 /WEB-INF/ , .jsp붙여서 뷰페이지로 간다.
	}//end search()//

}//end class
