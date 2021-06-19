public class Grade{
	public static void main(String[] arges){
		int score=91;
		String Grade="该考生成绩为F";
		if (score<0||score>100){
			Grade="该考生的成绩为：不合法";
		}else if (score>=90){//此时score一定在【0-100】内
			Grade="该考生的成绩为：A";
		}else if (score>=80){
			Grade="该考生的成绩为：B";
		}else if (score >= 70){
			Grade="该考生的成绩为：C";
		}else if (score >= 60){
			Grade="该考生的成绩为：D";
	    }
		System.out.println(Grade);
		}
}

