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
		s.name="����";
		
		System.out.println("ѧ��"+s.no);
		System.out.println("����"+s.name);
		
		//����ѧ������
		Student lisi = new Student();
		lisi.name="����";
		System.out.println(lisi.name);
		
	
	}

}
