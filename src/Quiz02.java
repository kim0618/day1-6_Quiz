import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		int kor,eng,math;
		
		System.out.println("=============");
		System.out.println("�̸� : ");
		name = input.next();
		System.out.println("=============");
		System.out.println("���� : ");
		kor = input.nextInt();
		System.out.println("���� : ");
		eng = input.nextInt();
		System.out.println("���� : ");
		math = input.nextInt();
		System.out.println("=============");
		System.out.println("�հ� : "+(kor+eng+math));
		System.out.println("=============");
		
		
		
		
		
		
	}
}
