package ½Ç½À;

public class ex21_CastOperator {
	public static void main(String[] args) {
		int i = 0xffff;
		short s;
		
		s = (short) i;
		System.out.println("i = " + i);
		System.out.println("s = "+ s);
	}
}
