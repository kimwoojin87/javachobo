package javachobo;

public class test4_14 {
	public static void main(String[] args) {
		//1~100������ ������ ���� �� answer�� ����
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt();//�Է¹��� ���� ���� input�� ����.
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else{
				System.out.println("������ϴ�.\n �õ�Ƚ���� "+count+"�Դϴ�.");
				break;
			}
			
		}while(true);
	}
}
