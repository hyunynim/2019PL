package 실습;
class Parent {
	public Parent(){
		System.out.println("super - default");
	}
	public Parent(int i){
		this("hello");
		System.out.println("super(int) constructor" + i);
	}
	public Parent(char c){
		this();
		System.out.println("super(char) constructor " + c);
	}
	public Parent(String s){
		this('A');
		System.out.println("super(String) constructor " + s);
	}
}
class Child extends Parent{
	public Child() {
		super(10); // 5라인으로..
		System.out.println("sub() constructor");
	}
	public Child(int i) {
		//super(); 컴파일러가 넣어줌
		System.out.println("sub(int) constructor");
	}
}
public class ex52_ConstructorTest {
	public static void main(String[] args){
		Child c1 = new Child();
		System.out.println("------------------");
		Child c2 = new Child(10);
	}
}
