public class Test
{
	public static void main(String[] args){

		java.util.Scanner s= new java.util.Scanner(System.in);

		System.out.println("��ӭʹ�ñ�ϵͳ,��ͨ����ϵͳ�������һ��򵥵��ж�");
		System.out.println("˵��1��1��ʾ���꣬0��ʾ����");
		System.out.println("˵��2��1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");

		//�����Ա���Ϣ
		System.out.print("�������Ա�:");
		int sex=s.nextint();

		//�����������
		System.out.print("�����뵱ǰ����״��:");
		int weather=s.nextint();
		
		//�ж�����״��
		if (weather == 1)
		{//������
		 //System.out.println("������");
		 	if (sex==1)//��
			{System.out.print("��һ�Ѵ��ɡ");
			}
			else if (sex==0)//Ů
			{System.out.print("��һ��С��ɡ");
			}
			else
			{System.out.print("�����Ա�����ô���£�");
			}
		}
		else if(weather == 0)
		{	//����
			//System.out.println("����");
			//�����¶�
			int tem=s.nextint();
			if (tem>30)
				{if (sex==1)//��
					{System.out.print("��ī��");
					}
				else if (sex==0)//Ů
					{System.out.print("Ϳ��ɹ˪");
					}
				else
					{System.out.print("�����Ա�����ô���£�");
					}
		}
		else
		{System.out.print("�����������״����������������");
		}
}
	}