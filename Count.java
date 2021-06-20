//public class Count
//{
	//public static void main (String[] args)
	//{
		//for (int i=1; i<=100 ;i+=2 )
			//{System.out.print("奇数--》"+i);
		//}
		
	//}
//方法一

//public class Count
//{
	//public static void main (String[] args)
	//{
		//for (int i=1; i<=100 ;i++ )
			//{
			//System.out.print("i--》"+i);
			//if (i%2!=0)
				//{System.out.print(i);
			//}
		//}
		
	//}
//}

//计算1-100的奇数累加和
public class Count
{
	public static void main (String[] args)
	{
		int sum =0;

		for (int i=1; i<=100 ;i+=2 )
			{
				//先定义一个变量充当盒子
				//int sum =0;代码在循环体中就每次都先清零
				sum +=i;

				//输出语句放到这表示每执行一次就输出一次
				// System.out.print("sum="+sum);
			}
		System.out.print("sum="+sum);
	}
}

