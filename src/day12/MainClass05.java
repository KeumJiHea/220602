package day12;
/*
 * ������
 * - Ŭ���� �̸��� ������ �޼ҵ�
 * - ��ȯŸ���� ����(void�� �ȵ�!)
 * - ���� �ʱ�ȭ�ϴ� �뵵�� ���
 * - ��ü ������ ȣ��Ǵ� �޼ҵ�
 * - �����ڵ� �޼ҵ��̱� ������ �����ε��� ����
 */
class AAA{ //class�� �տ� public�� ���� -> �ܺο��� ���� �Ұ�
	private String version;
	public AAA() { // <- ������
		System.out.println("������ ����");
	}
	public AAA(String v) {
		System.out.println("v ������");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10"); //��ü�� ���� �� �����ڴ� ������ ����
		/// new AAA() �� �����ڸ� �ҷ��´ٴ� ��
		AAA b = new AAA();
		
	}
}
