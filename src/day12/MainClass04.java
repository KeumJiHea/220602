package day12;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		int k, e, m;
		//��, ��, ��, ��, ���
		// �� ��, ���� ����, �����ϴ� �޼ҵ� ����
		TestClass04 t = new TestClass04();
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�: ");
		k = input.nextInt();
		System.out.print("���� ���� �Է�: ");
		e = input.nextInt();
		System.out.print("���� ���� �Է�: ");
		m = input.nextInt();
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.sum();
		t.avg();
		
		System.out.println("����: " + t.getKor() + "��");
		System.out.println("����: " + t.getEng() + "��");
		System.out.println("����: " + t.getMath() + "��");
		System.out.println("����: " + t.getSum() + "��");
		System.out.println("���: " + t.getAvg() + "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
