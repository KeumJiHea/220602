package quiz;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Beverage{
	LinkedHashMap menumap = new LinkedHashMap();
	public Beverage() {
	      menumap.put("�Ƹ޸�ī��", "2500");
	      menumap.put("ī���", "3000");
	      menumap.put("�ٴҶ��", "3500");
	      menumap.put("���ڶ�", "3000");
	}
}

public class TestClass02 {
   // ����ȭ�����
   Scanner scan = new Scanner(System.in);
   Beverage bvg = new Beverage();
   String menu,price;
 
   
   public void print() {
      String password = "1234";

      while(true) {
         System.out.println("===== ���Ǳ� ���α׷� =====");
         System.out.println("���Ͻô� ���񽺸� �����ּ���");
         System.out.println("1. ��ǰ ����");
         System.out.println("2. ���Ǳ� ����");
         System.out.println("3. ���α׷� ����");
         System.out.print(">>>>");
         int choice=scan.nextInt();
         scan.nextLine();
         System.out.println();
         
         if(choice==1) { // ���� ���ȭ������ �̵�
            customerPrint();
         }else if(choice ==2) { //�����ڿ� ���ȭ������ �̵�
            System.out.println("��й�ȣ�� 1234 �Դϴ�");
            System.out.print("��й�ȣ�� �Է��ϼ��� : ");
            String UserPW = scan.next();
            if(UserPW.equals(password)) {
               managerPrint();
            }else {
               System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
               System.out.println("���� ȭ������ ���ư��ϴ�");
               continue;
            }
         }else if(choice==3){
         	System.out.println("���α׷��� �����մϴ�.");
         	break;
         	}
      }
   }
   

   // �����ڿ�ȭ�����
   public void managerPrint() {
      while(true) {
         System.out.println("===== SETUP =====");
         System.out.println("1.�޴��߰�");
         System.out.println("2.�޴�����");
         System.out.println("3.����");
         System.out.print(">>>> ");
         int mchoice = scan.nextInt();
         if(mchoice == 1) { // �޴��߰�
            addMenu();
            continue;
         }else if(mchoice == 2) { //�޴�����
            editMenu();
            continue;
         }else if(mchoice ==3) { //����
            System.out.println("�����ڸ�带 �����մϴ�");
            System.out.println("����ȭ������ �ǵ��ư��ϴ�");
            print();
            break;
         }
      }
   }
   // �޴��߰�
   public void addMenu() {
      System.out.println("�޴��� �߰��մϴ�");
      System.out.println("�߰��� �޴��� �̸��� �Է��ϼ���");
      System.out.print(">>>>");
      menu = scan.next();
      System.out.println(menu+"�� ������ �Է��ϼ���");
      System.out.print(">>>>");
      price = scan.next();
      bvg.menumap.put(menu, price);
      
      System.out.println("�޴��� �߰��Ǿ����ϴ�");
   }
   
   // �޴�����
   public void editMenu() {
      while(true) {
         System.out.println("==== �޴� ���� ====");
         System.out.println(bvg.menumap.keySet());
         System.out.println("������ �޴��� �Է����ּ���");
         System.out.print(">>>> ");
         String modimenu = scan.next();         
         if(bvg.menumap.containsKey(modimenu)) { //�޴��� ������
            System.out.println("�����Ͻ� ��ǰ�� "+modimenu+"|"+bvg.menumap.get(modimenu)+"�� �Դϴ�.");
            System.out.println("1. ���� ����");
            System.out.println("2. ��ǰ ����");
            System.out.println("3. ����");
            System.out.print(">>>> ");
            int modichoice = scan.nextInt();
            if(modichoice ==1) { // ���ݼ���
               System.out.println("������ ������ �Է����ּ���");
               System.out.print("���簡��"+bvg.menumap.get(modimenu)+"�� "+">>>> ");
               String modiprice = scan.next();
               bvg.menumap.put(modimenu, modiprice);
               System.out.println("������ �Ϸ�Ǿ����ϴ�");
            }else if(modichoice ==2) { // �޴�����
               System.out.println(modimenu+"�� �����մϴ�");
               bvg.menumap.remove(modimenu);
               System.out.println("�����Ǿ����ϴ�");
            }else if(modichoice ==3) { // ����
               System.out.println("�޴������� �����մϴ�");
               break;
            }         
         }else{ // �޴��� ������
            System.out.println(modimenu+"�� ��ϵ��� ���� ��ǰ�Դϴ�");
            System.out.println("���� �������� �̵��մϴ�.");
            break;
         }
      }
      
   }
   
   // ����ȭ�����
   public void customerPrint() {
	      Iterator it = bvg.menumap.keySet().iterator();
	      if(bvg.menumap.isEmpty()) {
	         System.out.println("��ϵ� �޴��� �����ϴ�");
	         System.out.println("�����ڿ��� �����ϼ���");
	      }else{   
	         System.out.println("======== MENU ========");
	         int i=1;
	          while(it.hasNext()) {
	            String inmenu = (String) it.next();
	            System.out.println(i+". "+inmenu+"\t"+bvg.menumap.get(inmenu)+"��");
	            i++;
	          }
		     System.out.println("======================");
		     System.out.println("�޴��� �������ּ���\n");
		     int choice = scan.nextInt();
		     
	      }
   }
   // �ݾװ��
   
   
   // �ܵ���ȯ


}
