
public class Quiz09 {
	public static void main(String[] args) {
		
		//ù���� 1�� ���� ������ ���� 2�辿���� 30��° �Ǵ³� �����ؾ��ϴ� �ݾ�
		
		int money=1;
		for(int i=1;i<=30;i++) {
			if(i == 1) {
				money = 1;
			}else {
				money*=2;
			}System.out.println(i+":"+money);
		}System.out.println("30�� : "+money+"\n");
			
		
		//1~1000���� ���� 3�ǹ���� �����ϰ� 3��5�� ����� �������� ����
		
		int sum=0,sum1=0;
		for(int i=1;i<=1000;i++) {
			sum+=i;
			if(i%3 == 0 && i%5 != 0) {
				sum1 = sum1+i;
			}
		}sum=sum - sum1;
		System.out.println(sum+"\n");

		
		//1���ͽ����� Ȧ���� ���� ���ϸ鼭 ���� 10000�� ���� �ʴ� ������ ��
		
		int i=1, sum3=0;
		for(;sum3<10000;i++) {
			if(i%2==1) {
				sum3+=i;
			}
		}i--;
		System.out.println(i+" : " + sum3);

		
		
		
		
		
		
	}
}
