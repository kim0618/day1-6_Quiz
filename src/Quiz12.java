import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 2중 for문 문제
		
		// 구구단 15
		
	/*	for(int i=1;i<=15;i++) {
			for(int a=1;a<=15;a++) {
				System.out.print("구구단 : "+i+"*"+a);
				System.out.println(" = "+i*a);
			}
		}
		*/
		
		
		// 별 1,2,3,4,5
		
	/*	for(int b=1;b<=5;b++) {
			for(int c=1;c<=b;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		//행과 열 갯수를 입력하고 시작 문자를 입력후 아스키코드표에 의한 문자가 순차적으로 
		//출력되게 하시오로 문제 변경하겠습니다.
		
	
	/*	int go=0,so=0;
		char co= ' ';
		System.out.println("행 입력 : ");
		go = input.nextInt();
		System.out.println("열 입력 : ");
		so = input.nextInt();
		System.out.println("시작 문자 : ");
		co = input.next().charAt(0);
		for(int i=1; i<=go;i++) {
			for(int j=1;j<=so;j++) {
				System.out.print(co+" ");
				co++;
			}
			System.out.println();
		}
		*/
		
		// 10부터 거꾸로 출력
		
	/*	for (int w=10; w>0; w--) {
			for(int q=1;q<=w;q++) {
				System.out.print(q);
			}
			System.out.println();
		}
		*/
		
		//김성윤
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9
		int i,j,n=0,sw=1,p,r=0,rot=5,c=-1;
	      int[][] hey= new int[6][6];
	      while(true) {
	         for(p=0;p<rot;p++) {
	            n++;
	            c+=sw;
	            hey[r][c] =n;
	         }
	         rot-=1;
	         if(rot>0) {
	            for(p=0;p<rot;p++) {
	               n++;
	               r+=sw;
	               hey[r][c] =n;
	            }
	            sw*=(-1);
	         }else {
	            break;
	         }
	      }
	      for(i=0;i<5;i++) {
	         for(j=0;j<5;j++) {
	            System.out.print(String.format("%3d",hey[i][j]));
	         }
	         System.out.println();
	      }
		
		
		
		
		
		
	}
}
