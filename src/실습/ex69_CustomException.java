package 실습;
class MyCustomException extends Exception {
	  public MyCustomException(String msg) {
	    super(msg);
	  }
}

public class ex69_CustomException {
	public static void throwsMycustomException() throws MyCustomException {
	    throw new MyCustomException("사용자 정의 예외 발생 !");
	  }

	  public static void main(String args[]) {
	   try {
	     throwsMycustomException();
	    }
	    catch(RuntimeException e) {
	      System.out.println("==================================");
	      System.out.println("RuntimeException catched! ");
	      System.out.println(e + " 예외 발생");
	    }
	    catch(MyCustomException e) {
	      System.out.println("==================================");
	      System.out.println("throwsMycustomException  catched! ");
	      System.out.println(e + " 예외 발생");
	    }
	  }
}
