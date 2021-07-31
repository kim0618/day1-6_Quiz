import java.util.Scanner;

public class Quiz06_T {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//제 문제는 점수 입력 받고 90점이상은 A ,
		//80점은 B , 70점이상은 C  , 60점 이상은 D ,
		//60점 이하는 F로 F는 불합격 입니다. 라고 코드 작성해주세요
		
	/*	int a;
		System.out.println("점수 : ");
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
			System.out.println("F는 불합격 입니다");
		}
		
		
		//제 문제는 정수 3개를 입력받아서 합계를 구한후 
		//합계가 100이 넘어가면 "합격입니다", 100을 못넘어가면 "불합격입니다" 출력해주세요 !
		
		int b,b1,b2,sum;
		System.out.println("세 수 입력 : ");
		b = input.nextInt();
		b1 = input.nextInt();
		b2 = input.nextInt();
		sum = b+b1+b2;
		if(sum>=100) {
			System.out.println("합격");
		}
		else if(sum<100) {
			System.out.println("불합격");
		}
		
		
		
		//제문제는 취학전 아동(8세 미만)은 500원. 초등학생(14살 미만)은 1,000원, 
		//중고등학생(20살 미만)은 1,500원을 입장료를 받기로 하겠습니다. 최종 출력시 예) 초등학생 입니다. 
		//입장료는 " OOO원 입니다" 라고 출력되게 해주세요
		
		int c;
		System.out.println("나이 : ");
		c=input.nextInt();
		if(c<8) {
			System.out.println("아동 입니다.");
			System.out.println("입장료는 500원 입니다.");
		}
		else if(c<14) {
			System.out.println("초등학생 입니다.");
			System.out.println("입장료는 1000원 입니다.");
		}
		else if(c<20) {
			System.out.println("중고등학생 입니다.");
			System.out.println("입장료는 1500원 입니다.");
		}
		
		
		// 제 문제는 주문을 받아 할인이 적용된 총 금액을 출력하는 문제입니다.
		// 5000원 짜장면 수와 6000원 짬뽕 수를 입력받아 
		// 짜장면과 짬뽕의 갯수가 총 5그릇 이상일 경우 5%할인,
		// 10그릇 이상일 경우 10%할인이 가능 할 때 총 계산 금액을 출력하시오.

		int a,b,bl,rl,sum;
		double sum1;
		System.out.println("갯수 : ");
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
		
		//제 문제는 하나의 정수를 입력받아 40보다 작으면 "40보다 작은 수" 
		//60보다 크면 "60보다 큰 수" 40~60를 포함하는 수라면 "40~60을 포함하는 수"를 출력하세요. 
		//입니다.
		
		int a;
		System.out.println("수 입력 : ");
		a = input.nextInt();
		if(a<40) {
			System.out.println("40보다 작은 수");
		}
		else if(a>60) {
			System.out.println("60보다 큰 수");
		}
		if(a>=40 && a<=60) {
			System.out.println("40~60을 포함하는 수");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
