public class Aix
{
	public static void sum(int a,int b)
	{
		System.out.println(a+ "+" +b+ "=" +(a+b));
		Aix.doSome();//��ʱ���������ִ�У����������java��䣬��ִ��
	}
	
	public static void main(String[] args)//�������������ʼִ��
	{
		Aix.sum(1,2);//ִ�е����ʱ��ȥ�������еĺ���
		System.out.println("Hello World");
	}

	public static void doSome()
	{
		System.out.println("do some!");
	}
}