import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 쌀 100통에 암수 1쌍 쥐, 쥐한마리가 하루에 20g쌀먹고 10일마다 쥐의 수가 2배 증가
		// 며칠만에 창고의 쌀이 모두 쥐의 먹이가 될까?, 쥐는 총 몇마리? 
		
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
		
		// 두 수의 최소 공배수와 최대 공약수를 구하는 프로그램 작성
		// 최소공배수 = 공배수 중 가작 작은 정수
		// 최대공약수 = 공약수 중 가장 큰 수
				
		int num1, num2, max=0, min=0, i=2;
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		while(i<=num1&&i<=num2){
			if(num1%i==0&&num2%i==0)
					min=i;
				i++;
		}
		max=num1*num2/min;	//최소 공배수 구하는 식
		System.out.println("최소 공배수 : "+max);
		System.out.println("최대 공약수 : "+min);
		
		
		
		// 어떤 수의 약수를 구하는 프로그램
		// 약수 = 어떤 수를 정수로 나눌 수 있는 수
		
		int b=0,c=0;
		
		System.out.println("수 : ");
		b = input.nextInt();
		for(c=1;c<=b;c++) {
			if(b%c == 0) {
				System.out.println(c);
			}
		}System.out.println();	
		
		// 1에서 1000까지의 자연수 중 4와6으로 나눠 1인 수 합
		
		int a=0,sum=0;
		
		for(a=1;a<=1000;a++) {
			if(a%4==1 && a%6==1) {
				sum +=a;
			}
		}System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}
}
