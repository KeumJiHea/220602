package quiz;
/*
 * ���̵� �����ϴ� ��� �����
 * set, get �޼ҵ� ����
 * ���̸� ������ �����ϴ� �޼ҵ嵵 ����
 * �Է� -> ���� �Է�: 20
 * ��� -> ���̴� 19���̱���
 */
public class TestClass01 {
	private int age;
	
	public void setAge(int age) {
		this.age = age; //�޼ҵ� �ۿ� �ִ� ������ ����� ���� this
	}
	
	public int getAge() {
		return age;
	}
	
	public void op() {
		age -= 1;
	}
}
