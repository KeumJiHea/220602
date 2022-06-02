package day12;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		int k, e, m;
		//국, 영, 수, 합, 평균
		// 각 셋, 게터 생성, 연산하는 메소드 생성
		TestClass04 t = new TestClass04();
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		k = input.nextInt();
		System.out.print("영어 점수 입력: ");
		e = input.nextInt();
		System.out.print("수학 점수 입력: ");
		m = input.nextInt();
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.sum();
		t.avg();
		
		System.out.println("국어: " + t.getKor() + "점");
		System.out.println("영어: " + t.getEng() + "점");
		System.out.println("수학: " + t.getMath() + "점");
		System.out.println("총합: " + t.getSum() + "점");
		System.out.println("평균: " + t.getAvg() + "점");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
