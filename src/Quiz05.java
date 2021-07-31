import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// 날짜 입력 1=월, 2=화, 3=수 ------- 8=월 ,9=화
	/*	int day=0;
		while(true) {
			System.out.println("날짜 : ");
			day = input.nextInt();
			day = day%7;
			switch(day) {
			case 1:
				System.out.println(day+" : 월");break;
			case 2:
				System.out.println(day+" : 화");break;
			case 3:
				System.out.println(day+" : 수");break;
			case 4:
				System.out.println(day+" : 목");break;
			case 5:
				System.out.println(day+" : 금");break;
			case 6:
				System.out.println(day+" : 토");break;
			case 7:
				System.out.println(day+" : 일");break;
			}
		}*/
		
		// 우리집, 회사 등록 후 보기
		String home="",com="";
		int a;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			a = input.nextInt();
		switch(a) {
		case 1:
			System.out.println("우리집 등록 : ");
			home = input.next();
			System.out.println("등록 성공");
			break;
		case 2:
			System.out.println("회사 등록 : ");
			com = input.next();
			System.out.println("등록 성공");

			break;
		case 3: 
			System.out.println("우리집 : "+home);
			System.out.println("회사 : "+com);
			break;
		}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
