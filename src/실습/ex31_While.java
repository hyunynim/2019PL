package 실습;

public class ex31_While {
	public static void main(String[] args) {
		int N = 1; //실행 이후 N을 10으로 바꾼 뒤 재실행 해볼 것
		System.out.println("구구단 3단");
		while(N < 10){
			System.out.println( 3 + "*" + N + " = " + (3 * N));
			N++;
		}
	}
}
