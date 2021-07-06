package Study02;

/**
 * 构造方法的作用
 * 		1.创建对象
 * 		2.创建对象的同时，初始化实例变量的内存空间.【给实例变量赋值】
 * 
 *成员变量之实例变量，属于对象级别的变量，这种变量必须现有对象才能有实例变量
 *实例变量没有手动赋值的时候，系统默认赋值，那么这个系统的默认赋值在什么时候完成的呢？
 *		是类加载的时候吗？
 *			不是，因为类加载只加载了代码片段，还没来得及创建对象。所以此时实例变量并没有初始化；
 *
 *		事实上，实例变量的内存空间是在构造方法执行过程中开辟的。完成初始化的、
 *		系统在默认赋值时，也是在构造执行过程中完成的赋值.
 *
 *实例变量是存在堆内存中
 */

public class Study02 {
	public static void main(String[] args) {
		//查看访问的是哪个属性，查看用的是哪个方法：ctrl + 鼠标停留
		//在一个元素过多的类中，使用ctrl+o查找方法
		//创建对象
		Account act1 = new Account();
		act1.setActno("2966727730");
		
		System.out.println("账号："+ act1.getActno());
		System.out.println("余额" + act1.getBalance());
		
		Account act2 = new Account("2245380480");
		
		System.out.println("账号："+ act2.getActno());
		System.out.println("余额" + act2.getBalance());
		
		Account act3 = new Account(1000000.0);
		
		System.out.println("账号："+ act3.getActno());
		System.out.println("余额" + act3.getBalance());
		
		Account act4 = new Account("2966727730",1000000000000000000L);
		
		System.out.println("账号："+ act4.getActno());
		System.out.println("余额" + act4.getBalance());
	}

}
