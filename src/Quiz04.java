import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	/*	
		//�Է��� �����Ͱ� 3�� ����� ��� ���
		int a;
		System.out.println("�Է� : ");
		a = input.nextInt();
		if(a%3 ==0) {
			System.out.println("3�� ��� : "+a);
		}else {
		System.out.println("3�� ����� �ƴϴ�");}
		
//**		// �Է��� ���� ���밪 ���ϱ�
		int b;
		System.out.println("�Է� : ");
		b= input.nextInt();
		if(b>=0) {
			System.out.println(b);
		}else if(b<0) {
			System.out.println(b*-1);
		}
		
		// �μ��� �Է� �޾� ū �� ���
		int c,d;
		System.out.println("�� �� �Է� : ");
		c = input.nextInt();
		d = input.nextInt();
		if(c>d) {
			System.out.println("ū �� : "+c);
		}else if(d>c) {
			System.out.println("ū �� : "+d);
		}
		
//**		// �� ���� �Է� �޾� ū ���� ���
		int e,f,g,max;
	    System.out.println("�� �� �Է� : ");
	    e = input.nextInt();
	    f = input.nextInt();
	    g = input.nextInt();
		if(e>f && e>g) {
			max = e;
		}else if(f>e && f>g) {
			max = f;
		}else {
			max = g;
		}
		System.out.println("���� ū �� : "+max);
		
		// �μ��� �Է� �޾� ū ���� ¦���̸� ���
		int h,i;
		System.out.println("�� �� �Է� : ");
		h = input.nextInt();
		i = input.nextInt();
		if(h>i && h%2 ==0) {
			System.out.println(h);
		}
		if(i>h && i%2==0) {
			System.out.println(i);
		}
	*/
		
		//�� �� �Է� ���� ¦��, 3�� ��� ���
		int j,k,sum1;
		
		System.out.println("�� �� �Է� : ");
		j = input.nextInt();
		k = input.nextInt();
		sum1 = j+k;
		if(sum1%2 ==0 && sum1%3 ==0) {
			System.out.println(sum1);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
