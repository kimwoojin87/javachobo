package javachobo;

public class test4_14 {
	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();//입력받은 값을 변수 input에 저장.
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else{
				System.out.println("맞췄습니다.\n 시도횟수는 "+count+"입니다.");
				break;
			}
			
		}while(true);
	}
}
