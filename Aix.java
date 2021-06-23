public class Aix
{
	public static void sum(int a,int b)
	{
		System.out.println(a+ "+" +b+ "=" +(a+b));
		Aix.doSome();//此时这个方法被执行，可在这里放java语句，则执行
	}
	
	public static void main(String[] args)//程序从主方法开始执行
	{
		Aix.sum(1,2);//执行到这的时候去调第三行的函数
		System.out.println("Hello World");
	}

	public static void doSome()
	{
		System.out.println("do some!");
	}
}