package 실습;
class Card{
	final int Number;
	final String Kind;
	
	Card(String kind, int num){
		Kind = kind;
		Number = num;
	}
	Card(){
		this("Heart", 1);
	}
	public String toString(){
		return Kind + " " + Number;
	}
}

public class ex64_FinalTest {
	public static void main(String[] args) {
		Card c = new Card("Heart", 10);	
		// 생성자로 인해 변수 초기화.
//		c.Number=5;	        // final 변수이기 때문에 변경불가.
		System.out.println(c.Kind);
		System.out.println(c.Number);
	}
}
