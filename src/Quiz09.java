
public class Quiz09 {
	public static void main(String[] args) {
		
		//첫날에 1원 예금 다음날 전날 2배씩증가 30일째 되는날 예금해야하는 금액
		
		int money=1;
		for(int i=1;i<=30;i++) {
			if(i == 1) {
				money = 1;
			}else {
				money*=2;
			}System.out.println(i+":"+money);
		}System.out.println("30일 : "+money+"\n");
			
		
		//1~1000까지 합중 3의배수는 제외하고 3과5의 배수는 제외하지 않음
		
		int sum=0,sum1=0;
		for(int i=1;i<=1000;i++) {
			sum+=i;
			if(i%3 == 0 && i%5 != 0) {
				sum1 = sum1+i;
			}
		}sum=sum - sum1;
		System.out.println(sum+"\n");

		
		//1부터시작해 홀수의 합을 구하면서 합이 10000을 넘지 않는 마지막 수
		
		int i=1, sum3=0;
		for(;sum3<10000;i++) {
			if(i%2==1) {
				sum3+=i;
			}
		}i--;
		System.out.println(i+" : " + sum3);

		
		
		
		
		
		
	}
}
