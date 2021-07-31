
public class Quiz07 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<5;i++) {
			System.out.println(i+".hello");
		}
		System.out.println();
		
		
		int sum=0;
		for(int j=1;j<=100;j++) {
			sum+=j;
			if(sum == 528) {
			System.out.println(j+ "-"+sum);
			}
		}
		
		
		for(int a=1;a<=25;a++) {
			System.out.print(a +"\t");
			if(a%5 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
		
		
	}
}
