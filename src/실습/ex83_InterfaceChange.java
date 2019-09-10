package 실습;
interface A {
	void method1();
	default void method2(){         //default Keyword로 메서드를 구현.
		System.out.println("A's Method");     
	}
}

interface B {
	void method1();
	default void method2(){         //default Keyword로 메서드를 구현.
		System.out.println("B's Method");     
	}
}

interface C {
	static final String message="Hello!   C's Static Method";
	static void print(){               //인터페이스에서 정적 메서드 구현.
		System.out.println(message);
	}
}

public class ex83_InterfaceChange implements A,B{	//모호성 문제 발생
	@Override                    //일반적인 추상 메서드 구현.
	public void method1() {
		System.out.println("implemented method");		
	}

	@Override
	public void method2() {		             
		A.super.method2();            //A 인터페이스의 메서드 선택.
		      //or
		B.super.method2();            //B 인터페이스의 메서드 선택.
	}
	
	public static void main(String[] args){
		ex83_InterfaceChange ic = new ex83_InterfaceChange();
		ic.method1();
		ic.method2();
		C.print();          //인스턴스 생성 없이 호출 가능.
	}       
}
