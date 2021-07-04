package Tset02;

public class Test02 {

	public static void main(String[] args) {
		
		Husband xiaoming = new Husband();
		xiaoming.name="»ÆÏşÃ÷";
		
		Wife baby = new Wife();
		baby.name="angelbaby";
		
		xiaoming.w = baby;
		baby.h = xiaoming;
		
		System.out.println(xiaoming.w.name);
		System.out.println(baby.h.name);
		

	}

}
