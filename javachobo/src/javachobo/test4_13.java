package javachobo;

public class test4_13 {

	public static void main(String[] args) {
		String value = "12834";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i )�� �̿��ؼ� ���ڿ��� ���ڸ�
		//�ϳ��� �о �˻��Ѵ�.
		for(int i=0;i<value.length();i++) {
			ch = value.charAt(i);
			System.out.println(ch);
			if(!(ch>='0'&&ch<='9')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		}else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}

	}//end main

}//end class
