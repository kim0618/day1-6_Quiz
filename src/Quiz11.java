import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 로그인
		
	/*	String saveid=null,savepw=null,newid=null,newpw=null;
		int a=0;	
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>> ");
			a=input.nextInt();
			switch(a) {
			case 1:
				System.out.println("id 입력 : ");
				newid=input.next();
				System.out.println("pw 입력 : ");
				newpw=input.next();
				if(newid.equals(saveid) && newpw.equals(savepw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패 ! ! !");
				}
				break;
			case 2:
				System.out.println("저장 id 입력 : ");
				saveid = input.next();
				System.out.println("저장 pw 입력 : ");
				savepw = input.next();
				System.out.println("등록 성공");
				break;
			}
			System.out.println("프로그램 종료");
			break;
		}
		*/
		
	/*	int a=0;
		int c=0;
		System.out.println("요금을 투입 하세요 >>> ");
		a= input.nextInt();
		while(true) {
			System.out.println("========커피 자판기========");
			System.out.println("1.커피(200)\t2.코코아(250)\t3.반환  4.종료");
			System.out.println("메뉴를 선택 하세요 >>> ");
			c=input.nextInt();
			switch(c) {
			case 1:
				if(a>=200) {
					System.out.println("맛있게 드세요");
					a-=200;
				}else if(a<200) {
					System.out.println("요금이 부족합니다.");
				}
				break;
			case 2:
				if(a>=250) {
					System.out.println("맛있게 드세요");
					a-=250;
				}else if(a<250) {
					System.out.println("요금이 부족합니다.");
				}
				break;
			case 3:
				System.out.println("거스름 돈 : "+a);
				a=0;
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			}
		}
		*/
		
		int money=0,as=0;
		System.out.println("요금을 투입 하세요 >>> ");
		money= input.nextInt();
		while(true) {
			System.out.println("========커피 자판기========");
			System.out.println("1.커피(200)\t2.코코아(250)\t3.반환  4.종료");
			System.out.println("메뉴를 선택 하세요 >>> ");
			as=input.nextInt();
		if((as == 1 && money < 200) || (as == 1 && money < 250)){
			System.out.println("금액이 부족합니다.");
		}
		else if(as ==1) {
			System.out.println("맛있게 드세요");
			money = money - 200;
		}
		else if(as ==2) {
			System.out.println("맛있게 드세요");
			money = money - 250;
		}
		else if(as== 3) {
			System.out.println("거스름 돈 : "+money);
			money = 0;
		}
		else if(as==4) {
			System.out.println("프로그램 종료");
			break;
		}
			
		}
		
		
		
		
		
		
		
		
	}
}
