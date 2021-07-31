import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	/*	
		//입력한 데이터가 3의 배수인 경우 출력
		int a;
		System.out.println("입력 : ");
		a = input.nextInt();
		if(a%3 ==0) {
			System.out.println("3의 배수 : "+a);
		}else {
		System.out.println("3의 배수가 아니다");}
		
//**		// 입력한 수의 절대값 구하기
		int b;
		System.out.println("입력 : ");
		b= input.nextInt();
		if(b>=0) {
			System.out.println(b);
		}else if(b<0) {
			System.out.println(b*-1);
		}
		
		// 두수를 입력 받아 큰 수 출력
		int c,d;
		System.out.println("두 수 입력 : ");
		c = input.nextInt();
		d = input.nextInt();
		if(c>d) {
			System.out.println("큰 수 : "+c);
		}else if(d>c) {
			System.out.println("큰 수 : "+d);
		}
		
//**		// 세 수를 입력 받아 큰 수를 출력
		int e,f,g,max;
	    System.out.println("세 수 입력 : ");
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
		System.out.println("가장 큰 수 : "+max);
		
		// 두수를 입력 받아 큰 수가 짝수이면 출력
		int h,i;
		System.out.println("두 수 입력 : ");
		h = input.nextInt();
		i = input.nextInt();
		if(h>i && h%2 ==0) {
			System.out.println(h);
		}
		if(i>h && i%2==0) {
			System.out.println(i);
		}
	*/
		
		//두 수 입력 합이 짝수, 3의 배수 출력
		int j,k,sum1;
		
		System.out.println("두 수 입력 : ");
		j = input.nextInt();
		k = input.nextInt();
		sum1 = j+k;
		if(sum1%2 ==0 && sum1%3 ==0) {
			System.out.println(sum1);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
