package day12;

public class TestClass04 {
	private int kor, eng, math, sum;
	private double avg;
	
	public void setKor(int k) {kor = k;}
	
	public int getKor() {return kor;}
	
	public void setEng(int e) {eng = e;}
	
	public int getEng() {return eng;}
	
	public void setMath(int m) {math = m;}
	
	public int getMath() {return math;}
	
	public void sum() {sum = kor+eng+math;}
	
	public int getSum() {return sum;}
	
	public void avg() {avg = sum/3.0;}
	
	public double getAvg() {return avg;}
	
	
	
}
