import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,a1,a2;
		
		System.out.println("�� �Է� : ");
		a = input.nextInt();
	/*	if(a%2 == 0) {
			System.out.println("¦ : "+a);
		}else if(a%2 == 1){
			System.out.println("Ȧ : "+a);
		}*/
		
		String s1 = (a%2 == 0)?"¦":"Ȧ";
		System.out.println(a+" : "+s1);
		
		s1 = (a%3 == 0)?"3�� ���":"3�� ����� �ƴϴ�";
		System.out.println(s1);
		
		System.out.println("�� �� �Է� : ");
		a1 = input.nextInt();
		a2 = input.nextInt();
		System.out.println("a1 : "+a1+", a2 : "+a2);
		String s2 = (a1>a2)?"a1�� a2���� ũ��":"a2�� a1���� ũ��";
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
	}
}
