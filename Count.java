public class Count{
	public static void main(String[] args[]){
		
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ñ�����");
		
		System.out.print("�������һ������:");
		int.num1 = s.nextint();
		
		System.out.print("����������:");
		String operator = s.next();
		
		System.out.print("������ڶ�������:");
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
					System.out.println("�Բ��𣬸�ϵͳ��֧�ָ�������");
		
			}
		
		System.out.print("������Ϊ"+num1+ operator +num2+ "=" +result);
	}
}
