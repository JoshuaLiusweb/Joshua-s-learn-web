package Study02;

public class Account {
	//账号
	private String actno;//实例变量/对象变量，也就是说没有对象不存在
	
	//余额
	private double balance;
	
	//无参数构造器
	public Account()
	{
		//初始化内存空间
		//actno = null；
		//balance = 0.0；
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
