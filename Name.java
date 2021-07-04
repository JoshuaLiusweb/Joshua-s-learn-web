package Test.javase;

public class Name {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		System.out.println(s.sex);
		
		s.no=10;
		s.name="张三";
		
		System.out.println("学号"+s.no);
		System.out.println("姓名"+s.name);
		
		//创建学生对象
		Student lisi = new Student();
		lisi.name="李四";
		System.out.println(lisi.name);
		
	
	}

}
