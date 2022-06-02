package day12;

public class TestClass02 {
	private String str; // private 정보은닉!
	private int num;
	private String name;
	
	public void setStr() {} //setter를 설정할때는 set + 변수이름으로 쓰는 암묵적 규칙
	public void setNum() {}
	public void setName() {}
	
	public void getStr() {}
	public void getNum() {}
	public void getName() {}
	
	public void setting(String s) {
		str = s;
	}
	
	public String getter() {
		return str;
	}
}
