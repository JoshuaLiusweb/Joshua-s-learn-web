package Study02;

/**
 * java���Ե��з�������ʱ�漰���������ݵ����⣬
 * ʵ���ϴ��ݵ��Ǳ����б����ֵ�����ƣ�
 * 
 *
 */

public class Test {
	public static void main(String[] args) {
		int i =10;
		add(i);//add��������ʱ
		System.out.println("main -->"+ i );//10
	}

public static void add(int i) {
	i++;
	System.out.println("add-->"+ i);//11
}
	
	}

