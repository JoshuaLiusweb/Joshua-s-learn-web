public class Grade{
	public static void main(String[] arges){
		int score=91;
		String Grade="�ÿ����ɼ�ΪF";
		if (score<0||score>100){
			Grade="�ÿ����ĳɼ�Ϊ�����Ϸ�";
		}else if (score>=90){//��ʱscoreһ���ڡ�0-100����
			Grade="�ÿ����ĳɼ�Ϊ��A";
		}else if (score>=80){
			Grade="�ÿ����ĳɼ�Ϊ��B";
		}else if (score >= 70){
			Grade="�ÿ����ĳɼ�Ϊ��C";
		}else if (score >= 60){
			Grade="�ÿ����ĳɼ�Ϊ��D";
	    }
		System.out.println(Grade);
		}
}

