package Study01;
/**
 * 关于java类中的构造方法；
 * 		1.构造方法又称为构造函数/构造器/Constructor
 * 		
 * 2.构造方法语法结构：
 * 			【修饰符列表】 构造方法名（形式参数列表）{
 * }
 * 		3.普通方法的语法结构：
 * 			【修饰符列表】返回值类型 方法名（形式参数列表）{
 * }
 * 		4.对于构造方法来说，“返回值类型不能指定，也不能写void，一旦写了void即变成普通方法。
 * 
 * 		5.对构造方法来说，构造方法名的方法名必须和类名一致。
 * 
 * 		6.构造方法的作用
 * 			构造方法的意义，通过构造方法的调用，可以创建对象。
 * 
 * 		7.调用
 * 			-普通方法的调用：方法修饰符中有static时：类名.方法名（实参列表）、没有static时：引用.方法名（实参列表）
 * 			-new 构造方法名（实参列表）
 * 
 * 		8.构造方法的返回值：
 * 			1.有返回值，但是这个”return：值“不需要写、java在构造方法结束时会自动写
 * 			相当于方法中“返回值：变量名”，该返回值的类型是构造方法所在类的类型。
 * 			由于构造方法返回值的类型是类本身，所以不需要编写返回值类型.
 * 
 * 		9.注释和取消注释：ctrl+/，多行注释ctrl+shift+/
 *
 *		10.当一个类中没有构造任何方法的话，系统默认给该类提供一个无参数的构造方法，这个参数被称为缺省构造器
 *
 *		11.当一个类已经将构造方法定义出来，那么系统则不再为默认为这个类提供缺省构造器。建议开发中手动将当前类提供无参数构造方法。因为无参数构造方法太常用了。
 *
 *		12.构造方法是可以重载的
 */

/**
 * public class User{
 * 		public User(){
 * 			System.out.println("User's Default Constructor Invoke!");
 *		}
 *	//有参数的构造方法
 *		public User（int i）{
 *          System.out.println("带有int类型参数的构造器");
 * }
 */

public class Study {
	//以下程序创建了2个对象，只要创建方法就会创建对象，并且一定是在堆内存中
	public static void main(String[] args){
	User u1 = new User();//调用无参方法
	User u2 = new User(10);//

	//调用带有static的方法：类名.
	study.dosome();
	dosome();
	
	//调用没有static的方法：引用.
	//doother方法再Study类当中，所以创建study对象
	//创建Study对象，调用无参数构造方法
	Study t= new Study();
	t.doother();
}
/**这是一个带有static的方法，方法名dosome
 * 
 */
public static void dosome() {
	System.out.println("do some!");//普通方法
}

public void doother() {//没有static，调用要创建对象
	System.out.println("do some!");//
}
