package javachobo;


public class test4_9 {
	public static void main(String[] args) {
//		���ڷ� �̷���� ���ڿ� str
//		�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ�
		String str = "1512313";
		int sum=0;
		
		for(int i=0; i<str.length();i++) {
			
			sum += str.charAt(i)-'0';
		}
		System.out.println("sum="+sum);
		
		
	}
}
