package quiz;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		t.setAge(age);
		t.op();
		age = t.getAge();
		System.out.println("나이는 "+ age + "세군요.");
	}
}
