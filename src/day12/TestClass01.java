package day12;
/*
 * this
 * - �޼ҵ��� 0��° �Ű�����
 * - �ڵ����� ������
 * - �ڱ� �ڽ��� ���� ����
 */
public class TestClass01 {
	public String str="�ν��Ͻ�";
	
	public void setStr() {
		String str;
		str = "���ڿ�"; //��������
		System.out.println(str);//���������� �켱
		System.out.println(this.str);
	}
	
	public void func() {
		System.out.println("func ����");
		System.out.println(this);
		this.func02();
	}
	
	public void func02() {
		System.out.println("func2 ����");

	}
	
	public void func03() {
		System.out.println(str);
	}
	
	public void func04() {
		this.str = "����Ͽ��� ���ض�";
		func03();
	}
}
