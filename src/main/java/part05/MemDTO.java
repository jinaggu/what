package part05;

public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;
	
	//무인자 생성자~
	public MemDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemDTO(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public MemDTO(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public MemDTO(int num, String name, int age, String loc) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	
	//겟터셋터 메소드 만들기
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
}//end class
