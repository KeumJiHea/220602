package day12;
/*
 * this
 * - 메소드의 0번째 매개변수
 * - 자동으로 생성됨
 * - 자기 자신의 값을 가짐
 */
public class TestClass01 {
	public String str="인스턴스";
	
	public void setStr() {
		String str;
		str = "문자열"; //지역변수
		System.out.println(str);//지역변수가 우선
		System.out.println(this.str);
	}
	
	public void func() {
		System.out.println("func 실행");
		System.out.println(this);
		this.func02();
	}
	
	public void func02() {
		System.out.println("func2 실행");

	}
	
	public void func03() {
		System.out.println(str);
	}
	
	public void func04() {
		this.str = "토요일에도 잘해라";
		func03();
	}
}
