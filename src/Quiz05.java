import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// ��¥ �Է� 1=��, 2=ȭ, 3=�� ------- 8=�� ,9=ȭ
	/*	int day=0;
		while(true) {
			System.out.println("��¥ : ");
			day = input.nextInt();
			day = day%7;
			switch(day) {
			case 1:
				System.out.println(day+" : ��");break;
			case 2:
				System.out.println(day+" : ȭ");break;
			case 3:
				System.out.println(day+" : ��");break;
			case 4:
				System.out.println(day+" : ��");break;
			case 5:
				System.out.println(day+" : ��");break;
			case 6:
				System.out.println(day+" : ��");break;
			case 7:
				System.out.println(day+" : ��");break;
			}
		}*/
		
		// �츮��, ȸ�� ��� �� ����
		String home="",com="";
		int a;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			a = input.nextInt();
		switch(a) {
		case 1:
			System.out.println("�츮�� ��� : ");
			home = input.next();
			System.out.println("��� ����");
			break;
		case 2:
			System.out.println("ȸ�� ��� : ");
			com = input.next();
			System.out.println("��� ����");

			break;
		case 3: 
			System.out.println("�츮�� : "+home);
			System.out.println("ȸ�� : "+com);
			break;
		}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
