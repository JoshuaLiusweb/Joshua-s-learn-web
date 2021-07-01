/**public class TestTime
{
	//以下不使用方法重载
	public static void main(String[] arges)
	{
		int result1 =sumInt(1,2);
		System.out.println(result1);

		double result2=sumDouble(1.0,2.0);
		System.out.println(result2);

		long result3 = sumLong(1L,2L);
		System.out.println(result3);
	}
	
	public static int sumInt ( int i ,int j)
	{
		return i+j;
	}
	
	public static double sumDouble ( double a ,double b)
	{
		return a+b;
	}
	
	public static long sumLong ( long x ,long y)
	{
		return x+y;
	}
}
*/


public class TestTime
{
	//以下使用方法重载
	public static void main(String[] arges)
	{
		int result1 =sum(1,2);
		System.out.println(result1);

		double result2=sum(1.0,2.0);
		System.out.println(result2);

		long result3 = sum(1L,2L);
		System.out.println(result3);
	}
	
	public static int sum ( int x ,int y)
		{
		return x+y;
	}
	public static double sum ( double x ,double y)
		{
		return x+y;
	}
	public static long sum ( long x ,long y)
	{
		return x+y;
	}
	
}




