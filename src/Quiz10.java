import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �� 100�뿡 �ϼ� 1�� ��, ���Ѹ����� �Ϸ翡 20g�Ҹ԰� 10�ϸ��� ���� ���� 2�� ����
		// ��ĥ���� â���� ���� ��� ���� ���̰� �ɱ�?, ��� �� ���? 
		
		int rice=100000;
		int mouse=2;
		int day;
		for(day=1;day<=rice;day++) {
			rice=rice - mouse*20;
			if(day%10 == 0) {
				mouse*=2;
			}
		}day--;
		System.out.println(day + " : "+mouse);
		System.out.println();
		
		// �� ���� �ּ� ������� �ִ� ������� ���ϴ� ���α׷� �ۼ�
		// �ּҰ���� = ����� �� ���� ���� ����
		// �ִ����� = ����� �� ���� ū ��
				
		int num1, num2, max=0, min=0, i=2;
		System.out.print("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		while(i<=num1&&i<=num2){
			if(num1%i==0&&num2%i==0)
					min=i;
				i++;
		}
		max=num1*num2/min;	//�ּ� ����� ���ϴ� ��
		System.out.println("�ּ� ����� : "+max);
		System.out.println("�ִ� ����� : "+min);
		
		
		
		// � ���� ����� ���ϴ� ���α׷�
		// ��� = � ���� ������ ���� �� �ִ� ��
		
		int b=0,c=0;
		
		System.out.println("�� : ");
		b = input.nextInt();
		for(c=1;c<=b;c++) {
			if(b%c == 0) {
				System.out.println(c);
			}
		}System.out.println();	
		
		// 1���� 1000������ �ڿ��� �� 4��6���� ���� 1�� �� ��
		
		int a=0,sum=0;
		
		for(a=1;a<=1000;a++) {
			if(a%4==1 && a%6==1) {
				sum +=a;
			}
		}System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}
}
