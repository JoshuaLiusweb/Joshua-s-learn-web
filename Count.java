//public class Count
//{
	//public static void main (String[] args)
	//{
		//for (int i=1; i<=100 ;i+=2 )
			//{System.out.print("����--��"+i);
		//}
		
	//}
//����һ

//public class Count
//{
	//public static void main (String[] args)
	//{
		//for (int i=1; i<=100 ;i++ )
			//{
			//System.out.print("i--��"+i);
			//if (i%2!=0)
				//{System.out.print(i);
			//}
		//}
		
	//}
//}

//����1-100�������ۼӺ�
public class Count
{
	public static void main (String[] args)
	{
		int sum =0;

		for (int i=1; i<=100 ;i+=2 )
			{
				//�ȶ���һ�������䵱����
				//int sum =0;������ѭ�����о�ÿ�ζ�������
				sum +=i;

				//������ŵ����ʾÿִ��һ�ξ����һ��
				// System.out.print("sum="+sum);
			}
		System.out.print("sum="+sum);
	}
}

