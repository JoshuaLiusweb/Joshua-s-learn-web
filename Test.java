public class Test
{
	public static void main(String[] args){

		java.util.Scanner s= new java.util.Scanner(System.in);

		System.out.println("欢迎使用本系统,您通过本系统可以完成一项简单的判断");
		System.out.println("说明1：1表示下雨，0表示天晴");
		System.out.println("说明2：1表示男，0表示女");
		System.out.println("说明3：温度为数字");

		//接受性别信息
		System.out.print("请输入性别:");
		int sex=s.nextint();

		//接受天气情况
		System.out.print("请输入当前天气状况:");
		int weather=s.nextint();
		
		//判断天气状况
		if (weather == 1)
		{//下雨天
		 //System.out.println("下雨天");
		 	if (sex==1)//男
			{System.out.print("带一把大黑伞");
			}
			else if (sex==0)//女
			{System.out.print("带一把小花伞");
			}
			else
			{System.out.print("您的性别是怎么回事？");
			}
		}
		else if(weather == 0)
		{	//晴天
			//System.out.println("晴天");
			//接受温度
			int tem=s.nextint();
			if (tem>30)
				{if (sex==1)//男
					{System.out.print("戴墨镜");
					}
				else if (sex==0)//女
					{System.out.print("涂防晒霜");
					}
				else
					{System.out.print("您的性别是怎么回事？");
					}
		}
		else
		{System.out.print("您输入的天气状况有误，请重新输入");
		}
}
	}