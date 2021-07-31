import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		int kor,eng,math;
		
		System.out.println("=============");
		System.out.println("이름 : ");
		name = input.next();
		System.out.println("=============");
		System.out.println("국어 : ");
		kor = input.nextInt();
		System.out.println("영어 : ");
		eng = input.nextInt();
		System.out.println("수학 : ");
		math = input.nextInt();
		System.out.println("=============");
		System.out.println("합계 : "+(kor+eng+math));
		System.out.println("=============");
		
		
		
		
		
		
	}
}
