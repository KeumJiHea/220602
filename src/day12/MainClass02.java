package day12;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		//t.str = "hello"; -> str이 private 이므로 직접 설정 못함
		//System.out.println(t.str);
		
		
		t.setting("박유덕"); //-> TestClass02에 setter와 getter 만들어서 값 넣고 호출함
		String s = t.getter();
		System.out.println(s);
	}
}
