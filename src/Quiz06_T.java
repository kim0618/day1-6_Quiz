import java.util.Scanner;

public class Quiz06_T {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//�� ������ ���� �Է� �ް� 90���̻��� A ,
		//80���� B , 70���̻��� C  , 60�� �̻��� D ,
		//60�� ���ϴ� F�� F�� ���հ� �Դϴ�. ��� �ڵ� �ۼ����ּ���
		
	/*	int a;
		System.out.println("���� : ");
		a = input.nextInt();
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else if(a>=60) {
			System.out.println("D");
		}
		else if(a<=60) {
			System.out.println("F�� ���հ� �Դϴ�");
		}
		
		
		//�� ������ ���� 3���� �Է¹޾Ƽ� �հ踦 ������ 
		//�հ谡 100�� �Ѿ�� "�հ��Դϴ�", 100�� ���Ѿ�� "���հ��Դϴ�" ������ּ��� !
		
		int b,b1,b2,sum;
		System.out.println("�� �� �Է� : ");
		b = input.nextInt();
		b1 = input.nextInt();
		b2 = input.nextInt();
		sum = b+b1+b2;
		if(sum>=100) {
			System.out.println("�հ�");
		}
		else if(sum<100) {
			System.out.println("���հ�");
		}
		
		
		
		//�������� ������ �Ƶ�(8�� �̸�)�� 500��. �ʵ��л�(14�� �̸�)�� 1,000��, 
		//�߰���л�(20�� �̸�)�� 1,500���� ����Ḧ �ޱ�� �ϰڽ��ϴ�. ���� ��½� ��) �ʵ��л� �Դϴ�. 
		//������ " OOO�� �Դϴ�" ��� ��µǰ� ���ּ���
		
		int c;
		System.out.println("���� : ");
		c=input.nextInt();
		if(c<8) {
			System.out.println("�Ƶ� �Դϴ�.");
			System.out.println("������ 500�� �Դϴ�.");
		}
		else if(c<14) {
			System.out.println("�ʵ��л� �Դϴ�.");
			System.out.println("������ 1000�� �Դϴ�.");
		}
		else if(c<20) {
			System.out.println("�߰���л� �Դϴ�.");
			System.out.println("������ 1500�� �Դϴ�.");
		}
		
		
		// �� ������ �ֹ��� �޾� ������ ����� �� �ݾ��� ����ϴ� �����Դϴ�.
		// 5000�� ¥��� ���� 6000�� «�� ���� �Է¹޾� 
		// ¥���� «���� ������ �� 5�׸� �̻��� ��� 5%����,
		// 10�׸� �̻��� ��� 10%������ ���� �� �� �� ��� �ݾ��� ����Ͻÿ�.

		int a,b,bl,rl,sum;
		double sum1;
		System.out.println("���� : ");
		a=input.nextInt();
		b=input.nextInt();
		sum = a+b;
		bl=a*5000;
		rl=b*6000;
		sum1 = bl+rl;
		if(sum>=5) {
			System.out.println(sum1=((int)sum1*0.95));
		}
		else if(sum>=10) {
			System.out.println(sum1=((int)sum1*0.9));
		}
		
		*/
		
		//�� ������ �ϳ��� ������ �Է¹޾� 40���� ������ "40���� ���� ��" 
		//60���� ũ�� "60���� ū ��" 40~60�� �����ϴ� ����� "40~60�� �����ϴ� ��"�� ����ϼ���. 
		//�Դϴ�.
		
		int a;
		System.out.println("�� �Է� : ");
		a = input.nextInt();
		if(a<40) {
			System.out.println("40���� ���� ��");
		}
		else if(a>60) {
			System.out.println("60���� ū ��");
		}
		if(a>=40 && a<=60) {
			System.out.println("40~60�� �����ϴ� ��");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
