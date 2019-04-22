package javachobo;

public class test4_6 {

	public static void main(String[] args) {
//		2개의 주사위
//		눈의 합이 6이 되는 모든 경우의 수.
		for(int i=1; i<7; i++) {
			for(int j=1;j<7;j++) {
				if(i+j==6) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}
