package Study02;

public class Account {
	//�˺�
	private String actno;//ʵ������/���������Ҳ����˵û�ж��󲻴���
	
	//���
	private double balance;
	
	//�޲���������
	public Account()
	{
		//��ʼ���ڴ�ռ�
		//actno = null��
		//balance = 0.0��
	}
	
	public Account(String s)
	{
		actno =s;
	}
	
	public Account(double d)
	{
		balance = d;
	}
	
	public Account(int s)
	{
	
	}
	
	public Account(String s,long y)
	{
		actno = s;
		balance = y;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
