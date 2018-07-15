package part02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //컨트롤러 명시했으면 꼭!!!!!!!!!!!!!! dispatcher-web에 빈으로 등록해야한다!!!! class로!!
public class HelloModelController {
	
	//이건 dispatcher로 가는게 아니니까 모든 url명시 해줘야한다.
	@RequestMapping("/view/part02/hellomodel.htm")
	public Model search() {
		Model model = new ExtendedModelMap();
		//모델 객체 생성.   //jsp에서 setAtrribute로 사용되는것이 모델이다(정보를 리퀘스트에 담아주는것)
		
		//처음은 name요소 , 그다음은 넘겨질 value 요소 ${name} 이렇게 되면 냥냥이 화면이 뿌려진다.
		model.addAttribute("name","냥냥");
		
		return model;
		
	}//end search()//

}//end class//
