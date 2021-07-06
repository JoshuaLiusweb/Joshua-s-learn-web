package Study02;

/**
 * 方法调用时，涉及到参数传递的问题，只有一种语法机制
 * ”将变量中保存的值传过去“
 * 只是有时候保存的是个值，有时候保存的是个地址
 *
 *
 */

public class Test01 {
	public static void main(String[] args) {
		User u = new User(20);
		//传递的是保存的值，只是此时的值保存的是一个地址
		add(u);
		System.out.println("main-->"+u.age);//21
	}
	
	public static void add(User u) {
		u.age++;
		System.out.println("add-->"+u.age);//21
	}
}


class User{
	//实例变量
	int age；
	
	//构造方法
	public User(int i) {
		age = 1
	}
}
