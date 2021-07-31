
public class Quiz08 {
	public static void main(String[] args) {
		
		// 구구단
		int a;
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				a = i*j;
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("");
		
		
		// 2중 for문
		
		for(int b=1;b<=5;b++) {
			for(int c=1;c<=5;c++) {
				System.out.print(b*c+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("");
		
		int e=1;
		for(int d=1;d<=5;d++) {
			for(int f=1;f<=5;f++) {
				System.out.print(e+++"\t");
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}
}
