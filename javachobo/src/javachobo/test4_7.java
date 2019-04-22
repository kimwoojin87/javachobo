package javachobo;

public class test4_7 {
	public static void main(String[] args) {
		//2x+4y=10 의 모든 해를 구하라
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(2*x+4*y==10) {
					System.out.println("x= "+x+","+" y= "+y);
				}
			}
		}
		
	}
}
