import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �α���
		
	/*	String saveid=null,savepw=null,newid=null,newpw=null;
		int a=0;	
		while(true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.println(">>> ");
			a=input.nextInt();
			switch(a) {
			case 1:
				System.out.println("id �Է� : ");
				newid=input.next();
				System.out.println("pw �Է� : ");
				newpw=input.next();
				if(newid.equals(saveid) && newpw.equals(savepw)) {
					System.out.println("�α��� ����");
				}else {
					System.out.println("�α��� ���� ! ! !");
				}
				break;
			case 2:
				System.out.println("���� id �Է� : ");
				saveid = input.next();
				System.out.println("���� pw �Է� : ");
				savepw = input.next();
				System.out.println("��� ����");
				break;
			}
			System.out.println("���α׷� ����");
			break;
		}
		*/
		
	/*	int a=0;
		int c=0;
		System.out.println("����� ���� �ϼ��� >>> ");
		a= input.nextInt();
		while(true) {
			System.out.println("========Ŀ�� ���Ǳ�========");
			System.out.println("1.Ŀ��(200)\t2.���ھ�(250)\t3.��ȯ  4.����");
			System.out.println("�޴��� ���� �ϼ��� >>> ");
			c=input.nextInt();
			switch(c) {
			case 1:
				if(a>=200) {
					System.out.println("���ְ� �弼��");
					a-=200;
				}else if(a<200) {
					System.out.println("����� �����մϴ�.");
				}
				break;
			case 2:
				if(a>=250) {
					System.out.println("���ְ� �弼��");
					a-=250;
				}else if(a<250) {
					System.out.println("����� �����մϴ�.");
				}
				break;
			case 3:
				System.out.println("�Ž��� �� : "+a);
				a=0;
				break;
			case 4:
				System.out.println("���α׷� ����");
				break;
			}
		}
		*/
		
		int money=0,as=0;
		System.out.println("����� ���� �ϼ��� >>> ");
		money= input.nextInt();
		while(true) {
			System.out.println("========Ŀ�� ���Ǳ�========");
			System.out.println("1.Ŀ��(200)\t2.���ھ�(250)\t3.��ȯ  4.����");
			System.out.println("�޴��� ���� �ϼ��� >>> ");
			as=input.nextInt();
		if((as == 1 && money < 200) || (as == 1 && money < 250)){
			System.out.println("�ݾ��� �����մϴ�.");
		}
		else if(as ==1) {
			System.out.println("���ְ� �弼��");
			money = money - 200;
		}
		else if(as ==2) {
			System.out.println("���ְ� �弼��");
			money = money - 250;
		}
		else if(as== 3) {
			System.out.println("�Ž��� �� : "+money);
			money = 0;
		}
		else if(as==4) {
			System.out.println("���α׷� ����");
			break;
		}
			
		}
		
		
		
		
		
		
		
		
	}
}
