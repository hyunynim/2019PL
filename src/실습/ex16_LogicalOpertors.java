package �ǽ�;

public class ex16_LogicalOpertors {
	public static void main(String[] args) {
		int x = 3, y = 5, z = 7;
		boolean b;
		
		b = x < y && y < z;
		System.out.println("Result = " + b);
		
		b = x == y || x < y && y > z;
		System.out.println("Result = " + b);
	}
}
