package Study02;

/**
 * java语言当中方法调用时涉及到参数传递的问题，
 * 实际上传递的是变量中保存的值（复制）
 * 
 *
 */

public class Test {
	public static void main(String[] args) {
		int i =10;
		add(i);//add方法调用时
		System.out.println("main -->"+ i );//10
	}

public static void add(int i) {
	i++;
	System.out.println("add-->"+ i);//11
}
	
	}

