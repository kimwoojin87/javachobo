package javachobo;

public class test4_10 {

	public static void main(String[] args) {
//		int Ÿ�� num
//		���ڸ����� ���� ���϶�.
		int num = 123456789;
		int sum =0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
