package �ǽ�;

public class ex04_PlusTest {
	public static void main(String[] args) {
		short a, b, c;
		a = 1;
		b = 2;
		c = a+b; 
		//compile error - ����� �ڵ����� int�� promotion�� �Ͼ
		//c = (short)(a+b);
		System.out.println(c);
	}
}
