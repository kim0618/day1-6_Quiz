import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,a1,a2;
		
		System.out.println("수 입력 : ");
		a = input.nextInt();
	/*	if(a%2 == 0) {
			System.out.println("짝 : "+a);
		}else if(a%2 == 1){
			System.out.println("홀 : "+a);
		}*/
		
		String s1 = (a%2 == 0)?"짝":"홀";
		System.out.println(a+" : "+s1);
		
		s1 = (a%3 == 0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(s1);
		
		System.out.println("두 수 입력 : ");
		a1 = input.nextInt();
		a2 = input.nextInt();
		System.out.println("a1 : "+a1+", a2 : "+a2);
		String s2 = (a1>a2)?"a1이 a2보다 크다":"a2가 a1보다 크다";
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
	}
}
