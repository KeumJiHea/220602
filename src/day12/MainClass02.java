package day12;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		//t.str = "hello"; -> str�� private �̹Ƿ� ���� ���� ����
		//System.out.println(t.str);
		
		
		t.setting("������"); //-> TestClass02�� setter�� getter ���� �� �ְ� ȣ����
		String s = t.getter();
		System.out.println(s);
	}
}
