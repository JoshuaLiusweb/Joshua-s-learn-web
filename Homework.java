public class Homework
{
	/*public static void main(String[] args)
	{
		//�ȱ�д������֤7�Ƿ�Ϊ����
		/*7%1=0
		7%2��=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6��=0
		7%7��=0
		
		int i=0;
		boolean issushu =true;//�ּ�����������
		for (int j=2;j<i ;i++ )
			{
				if (i%j==0)
				{
					issushu=false;
					break;
				}
			}
		System.out.print(issushu? i+"������":i+"��������")
	}*/

	/*public static void main(String[] args)
	{
		//�ȱ�д������֤7�Ƿ�Ϊ����
		/*7%1=0
		7%2��=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6��=0
		7%7��=0
		*
		int i=1;
		for (;i<=100 ;i++ )
		{
		
		boolean issushu =true;//�ּ�����������
		for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					issushu=false;
					break;
				}
			}
		System.out.print(issushu? i+"������":i+"��������");
		}
	}*/

	public static void main(String[] args)
	{
		//�ȱ�д������֤7�Ƿ�Ϊ����
		/*7%1=0
		7%2��=0
		7%3! =0
		7%4! =0
		7%5! =0
		7%6��=0
		7%7��=0
		*/
		int count=0;//����ͳ�ƻ���
		int i=1;
		for (;i<=100 ;i++ )
		{
		
		boolean issushu =true;//�ּ�����������
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