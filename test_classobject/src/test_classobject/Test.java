package test_classobject;

public class Test {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.age=20;
		stu.habbit="玩电游";
		stu.lesson="Java";
		stu.name="张三";
		stu.print();
		
		Teacher te=new Teacher();
		te.lesson="Java";
		te.name="李四";
		te.profession="计算机";
		te.year=8;
		te.print();

	}

}
