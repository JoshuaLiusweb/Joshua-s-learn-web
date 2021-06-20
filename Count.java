public class Count{
	public static void main(String[] args[]){
		
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.println("欢迎使用本程序");
		
		System.out.print("请输入第一个数字:");
		int.num1 = s.nextint();
		
		System.out.print("请输入计算符:");
		String operator = s.next();
		
		System.out.print("请输入第二个数字:");
		int.num2 = s.nextint();
		
		int result = 0;

		switch (operator)
			{
				case "+" :
					result = num1 + num2;
					break;

				case "-" :
					result = num1 - num2;
					break;

				case "*" :
					result = num1 * num2;
				    break;

				case "/" :
					result = num1 / num2;	
					break;

				case "%" :
					result = num1 % num2;
					break;
				default:
					System.out.println("对不起，该系统不支持该种运算");
		
			}
		
		System.out.print("运算结果为"+num1+ operator +num2+ "=" +result);
	}
}
