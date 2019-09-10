package �ǽ�;
interface A {
	void method1();
	default void method2(){         //default Keyword�� �޼��带 ����.
		System.out.println("A's Method");     
	}
}

interface B {
	void method1();
	default void method2(){         //default Keyword�� �޼��带 ����.
		System.out.println("B's Method");     
	}
}

interface C {
	static final String message="Hello!   C's Static Method";
	static void print(){               //�������̽����� ���� �޼��� ����.
		System.out.println(message);
	}
}

public class ex83_InterfaceChange implements A,B{	//��ȣ�� ���� �߻�
	@Override                    //�Ϲ����� �߻� �޼��� ����.
	public void method1() {
		System.out.println("implemented method");		
	}

	@Override
	public void method2() {		             
		A.super.method2();            //A �������̽��� �޼��� ����.
		      //or
		B.super.method2();            //B �������̽��� �޼��� ����.
	}
	
	public static void main(String[] args){
		ex83_InterfaceChange ic = new ex83_InterfaceChange();
		ic.method1();
		ic.method2();
		C.print();          //�ν��Ͻ� ���� ���� ȣ�� ����.
	}       
}
