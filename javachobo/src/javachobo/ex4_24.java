package javachobo;

import java.io.IOException;

public class ex4_24 {
	public static void main(String[] args) throws IOException {	
		int input = 0;
		
		System.out.println("문장을 입력하세요");
		System.out.println("입력을 마지려면 x를 입력하세요");
		
		do {
			input = System.in.read();
			System.out.println((char)input);
		}while(input != -1 && input !='x');
	}
}
