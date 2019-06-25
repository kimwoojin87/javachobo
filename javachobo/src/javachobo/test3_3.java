package javachobo;

public class test3_3 {

	public static void main(String[] args) {

//		int num = 10;
//		
//		//(num == 0)?0:((num>0)?("양수"):("음수"));내 풀이
//		//(num>0)?"양수":(num<0?"음수":"0"); 정답
//		System.out.println();
		
		
		//구디밥집 에너그램 만들기. 순서상관없이 2개만 골라서 모든 결과를 출력
		String ener[] = {"구","디","밥","집"};
		
		for(int i=0;i<ener.length;i++) {
			//System.out.print(ener[i]);
			for(int j=0;j<ener.length;j++) {
				System.out.println(ener[j]);
			}
			System.out.println(ener[i]);
		}
	}

}
