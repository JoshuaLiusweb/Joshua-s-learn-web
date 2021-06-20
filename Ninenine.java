public class Ninenine
{
	public static void main(String[] arges)
	{
		for (int i=1; i<=9; i++)
		{
			//纵向i循环9次，i是行号 i*？
			
			//程序的主要任务是处理当前行并全部输出
			for (int j=1;j<=i ;j++ )
				{System.out.print(i+"*"+j+"="+j*i+" ");
				}
		System.out.println();
		//System.out.print("\n")
		}
	}
}