public class Homework
{
	/*public static void main(String[] args)
	{
		//先编写程序验证7是否为素数
		/*7%1=0
		7%2！=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6！=0
		7%7！=0
		
		int i=0;
		boolean issushu =true;//现假设他是素数
		for (int j=2;j<i ;i++ )
			{
				if (i%j==0)
				{
					issushu=false;
					break;
				}
			}
		System.out.print(issushu? i+"是素数":i+"不是素数")
	}*/

	/*public static void main(String[] args)
	{
		//先编写程序验证7是否为素数
		/*7%1=0
		7%2！=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6！=0
		7%7！=0
		*
		int i=1;
		for (;i<=100 ;i++ )
		{
		
		boolean issushu =true;//现假设他是素数
		for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					issushu=false;
					break;
				}
			}
		System.out.print(issushu? i+"是素数":i+"不是素数");
		}
	}*/

	public static void main(String[] args)
	{
		//先编写程序验证7是否为素数
		/*7%1=0
		7%2！=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6！=0
		7%7！=0
		*/
		int count=0;//加入统计机制
		int i=1;
		for (;i<=100 ;i++ )
		{
		
		boolean issushu =true;//现假设他是素数
		for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					issushu=false;
					break;
				}
			}
		if (issushu)
		{
			count++;
			System.out.print(i+" ");
			if (count % 8 == 0)
			{
				System.out.println();
			}
			
		}
		}
	}
}