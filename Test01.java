package Study02;

/**
 * ��������ʱ���漰���������ݵ����⣬ֻ��һ���﷨����
 * ���������б����ֵ����ȥ��
 * ֻ����ʱ�򱣴���Ǹ�ֵ����ʱ�򱣴���Ǹ���ַ
 *
 *
 */

public class Test01 {
	public static void main(String[] args) {
		User u = new User(20);
		//���ݵ��Ǳ����ֵ��ֻ�Ǵ�ʱ��ֵ�������һ����ַ
		add(u);
		System.out.println("main-->"+u.age);//21
	}
	
	public static void add(User u) {
		u.age++;
		System.out.println("add-->"+u.age);//21
	}
}


class User{
	//ʵ������
	int age��
	
	//���췽��
	public User(int i) {
		age = 1
	}
}
