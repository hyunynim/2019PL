package ½Ç½À;

public class ex19_PrintTenItem {
	public static void main(String[] args) {
		int i, n = 25;
		
		for (i = 1; i <= n; ++ i) 
		System.out.print(i + ((i % 10 == 0 || i == n ) ? "\n" : " "));
	    }
}
