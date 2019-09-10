package ½Ç½À;

public class ex20_AssignmentOperators {
	public static void main(String[] args) {
		int x, y = 2;
		
		x = 10; x += y; System.out.println(" 1. x = "+ x);
		x = 10; x -= y; System.out.println(" 2. x = "+ x);
		x = 10; x *= y; System.out.println(" 3. x = "+ x);
		x = 10; x /= y; System.out.println(" 4. x = "+ x);
		x = 10; x%= y; System.out.println(" 5. x = "+ x);
		x = 10; x &=y; System.out.println(" 6. x = "+ x);
		x = 10; x |= y; System.out.println(" 7. x = "+ x);
		x = 10; x ^= y; System.out.println(" 8. x = "+ x);
		x = 10; x <<= y; System.out.println(" 9. x = "+ x);
		x = 10; x >>= y; System.out.println("10. x = "+ x);
		x = 10; x >>>= y; System.out.println("11. x = "+ x);
		x = -10; x >>= y; System.out.println("12. x = "+ x);
		x = -10; x >>>= y; System.out.println("13. x = "+ x);
	}
}
