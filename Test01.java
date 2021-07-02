public class Test01
{
	public static void main(String[] args)
	{
		//创建USER对象
		//u是一个局部变量
		//u是一个引用
		//u保存的内存地址指向堆内存的User对象
		User u = new User();

		//输出User对象内部实例变量的值
		System.out.println(u.no);//0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null

		//修改User对象内部实际变量的值
		u.no = 110;
		u.name ="jack";//jack是一个java对象，属于String对象
		u.addr= new Address();

		//在main方法当中目前只能看到一个引用“u”
		//一切都是只能通过u来进行访问
		System.out.println(u.name + "居住在哪个城市" + u.addr.city);
		System.out.println(u.name + "居住在哪个街道" + u.addr.street);
		System.out.println(u.name + "邮编" + u.addr.zipcode);

		u.addr.city = "北京";
		u.addr.street = "朝阳";
		u.addr.zipcode = "11111111";

		System.out.println(u.name + "居住在哪个城市" + u.addr.city);
		System.out.println(u.name + "居住在哪个街道" + u.addr.street);
		System.out.println(u.name + "邮编" + u.addr.zipcode);
	}

}