package javachobo;

public class test4_4 {

	public static void main(String[] args) {
		
		int i =0;
		while (i<=10) {
			int j= 0;
			while(j<=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
//		for(int i=0;i<=10;i++) {
//			for(int j =0; j<=i;j++) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
	}
}
