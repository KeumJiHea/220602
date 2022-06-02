package day12;
/*
 * 생성자
 * - 클래스 이름과 동일한 메소드
 * - 반환타입은 없음(void도 안됨!)
 * - 값을 초기화하는 용도로 사용
 * - 객체 생성시 호출되는 메소드
 * - 생성자도 메소드이기 때문에 오버로딩이 가능
 */
class AAA{ //class는 앞에 public이 없음 -> 외부에서 접근 불가
	private String version;
	public AAA() { // <- 생성자
		System.out.println("생성자 실행");
	}
	public AAA(String v) {
		System.out.println("v 생성자");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10"); //객체를 만들 때 생성자는 무조건 실행
		/// new AAA() 가 생성자를 불러온다는 뜻
		AAA b = new AAA();
		
	}
}
