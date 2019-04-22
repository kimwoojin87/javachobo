package javachobo;

public class test4_10 {

	public static void main(String[] args) {
//		int 타입 num
//		각자리수의 합을 구하라.
		int num = 123456789;
		int sum =0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
