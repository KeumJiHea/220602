package quiz;
/*
 * 나이도 저장하는 기능 만들기
 * set, get 메소드 생성
 * 나이를 만으로 연산하는 메소드도 생성
 * 입력 -> 나이 입력: 20
 * 출력 -> 나이는 19세이군요
 */
public class TestClass01 {
	private int age;
	
	public void setAge(int age) {
		this.age = age; //메소드 밖에 있는 변수를 사용할 때는 this
	}
	
	public int getAge() {
		return age;
	}
	
	public void op() {
		age -= 1;
	}
}
