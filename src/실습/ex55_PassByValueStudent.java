package ½Ç½À;
class Student{
	private String name;
	private int age;
	private int ID;
	public Student(String name, int age, int ID){
		setName(name);
		this.age=age;
		this.ID=ID;
	}
	public void setName(String name){
		this.name=name;
	}
	public void printAll(){
		System.out.println("name="+name+"\t age="+age+"\t ID="+ID);
	}
}

public class ex55_PassByValueStudent {
	public void passPrimitiveValue(int i){
		i=10;
	}
	public void passReferanceValue1(Student s){
		s = new Student("°©¼øÀÌ", 22, 98);
		//s.printAll();
	}
	public void passReferanceValue2(Student s){
		s.setName("°©µ¹ÀÌ");
	}
	public static void main(String[] args) {
		ex55_PassByValueStudent p = new ex55_PassByValueStudent();
		int i = 7;
		p.passPrimitiveValue(i);
		System.out.println("i="+i);
		Student s = new Student("È«±æµ¿", 20, 99);
		s.printAll();
		p.passReferanceValue1(s);
		s.printAll();
		p.passReferanceValue2(s);
		s.printAll();
	}
}
