package Study02;

/**
 * ���췽��������
 * 		1.��������
 * 		2.���������ͬʱ����ʼ��ʵ���������ڴ�ռ�.����ʵ��������ֵ��
 * 
 *��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��������ʵ������
 *ʵ������û���ֶ���ֵ��ʱ��ϵͳĬ�ϸ�ֵ����ô���ϵͳ��Ĭ�ϸ�ֵ��ʲôʱ����ɵ��أ�
 *		������ص�ʱ����
 *			���ǣ���Ϊ�����ֻ�����˴���Ƭ�Σ���û���ü������������Դ�ʱʵ��������û�г�ʼ����
 *
 *		��ʵ�ϣ�ʵ���������ڴ�ռ����ڹ��췽��ִ�й����п��ٵġ���ɳ�ʼ���ġ�
 *		ϵͳ��Ĭ�ϸ�ֵʱ��Ҳ���ڹ���ִ�й�������ɵĸ�ֵ.
 *
 *ʵ�������Ǵ��ڶ��ڴ���
 */

public class Study02 {
	public static void main(String[] args) {
		//�鿴���ʵ����ĸ����ԣ��鿴�õ����ĸ�������ctrl + ���ͣ��
		//��һ��Ԫ�ع�������У�ʹ��ctrl+o���ҷ���
		//��������
		Account act1 = new Account();
		act1.setActno("2966727730");
		
		System.out.println("�˺ţ�"+ act1.getActno());
		System.out.println("���" + act1.getBalance());
		
		Account act2 = new Account("2245380480");
		
		System.out.println("�˺ţ�"+ act2.getActno());
		System.out.println("���" + act2.getBalance());
		
		Account act3 = new Account(1000000.0);
		
		System.out.println("�˺ţ�"+ act3.getActno());
		System.out.println("���" + act3.getBalance());
		
		Account act4 = new Account("2966727730",1000000000000000000L);
		
		System.out.println("�˺ţ�"+ act4.getActno());
		System.out.println("���" + act4.getBalance());
	}

}
