package �ǽ�;

public class ex68_ExceptionError1 {
	 public static void main(String args[]) {
		 
		   try {
		      System.out.println("�Ű������� ���� �� ���� ��");
		      int a = Integer.parseInt(args[0]);    // ���ڿ� ���� ������ ��ȯ
		      int b = Integer.parseInt(args[1]);
		      System.out.println(" a = " + a + " b = " + b );
		      System.out.println(" a�� b�� ���� �� = " + (a/b) );
		      System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�.");
		    }
		    catch(ArithmeticException e) {
		      System.out.println("==================================");
		      System.out.println("ArithmeticException ó�� ��ƾ : ");
		      System.out.println(e + " ���� �߻�");
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("==================================");
		      System.out.println("ArrayIndexOutOfBoundsException ó�� ��ƾ");
		      System.out.println(e + " ���� �߻�");
		    }
		    catch(NumberFormatException e) {
		      System.out.println("==================================");
		      System.out.println("NumberFormatException ó�� ��ƾ");
		      System.out.println(e + " ���� �߻�");
		    }
		    finally {
		      System.out.println("==================================");
		      System.out.println("���� ó���� ������ finally ���� �����մϴ�");
		    }
	 }
}
