class StringF 
{
	public static void main(String[] args) 
	{
		int num = 10;
		char[] array = {'��','��','��','��'};
		String[] a = {"Nike����", "Adidas�˶���", "�����˶�Ь", "Kappa����", "361����"};
		//{'r', 'u', 'n', 'o', 'o', 'b' };
		boolean b = true;
		
		//String.valueOf() ����ת������
		System.out.println(String.valueOf(num));
		System.out.println(String.valueOf(array));
		System.out.println(String.valueOf(b));
		//String.trim() ȥ���ո�
		String stings = "      holler world;";
		System.out.println("δȥ�ո�" + stings);
		System.out.println("ȥ�ո�" + stings.trim());
		//�ַ�ת����  ͨ��forѭ��


		//����JSON �ַ��� �� java �����ת��

		//1. ��java �����б�ת��Ϊjson�������飬��תΪ�ַ���

		//	JSONArray array = JSONArray.fromObject(list);
		//	String jsonstr = array.toString();

		//2. ��java����ת����json���󣬲�ת��Ϊ�ַ���

		//	JSONObject object = JSONObject.fromObject(user);
		//    Log4jInit.ysulogger.debug(object.toString());

		//3.��JSON�ַ���ת��ΪJAVA ��������

		//	JSONArray json = JSONArray.fromObject(userStr);//userStr��json�ַ���
		//	List<User> users= (List<User>)JSONArray.toCollection(json, User.class);
		
		//4.��JSON�ַ���ת��ΪJAVA ����
			
		//	JSONObject jsonobject = JSONObject.fromObject(jsonStr);
		//��User user= (User)JSONObject.toBean(object,User.class);


		//StringBuffer �ٶ��� �̰߳�ȫ
		//StringBuilder �ٶȿ� �̲߳���ȫ��

		String buffers = "holler";
		StringBuffer buffer = new StringBuffer(buffers);
		//  public StringBuffer append(String s)
		//��ָ�����ַ���׷�ӵ����ַ����С�

		buffer.append(" world;");
		System.out.println("stringbuffer �µ� append ����׷�� :" + buffer);

		//	public StringBuffer reverse()
		//�����ַ��������䷴ת��ʽȡ����

		buffer.reverse();
		System.out.println("stringbuffer �µ� reverse �ַ���ת :" + buffer);

		//	public delete(int start, int end)
		//�Ƴ������е����ַ����е��ַ���

		buffer.reverse().delete(0,6);
		System.out.println("stringbuffer �µ� delete �ַ�ɾ�� :" + buffer);

		//	public insert(int offset, int i)
		//�� int �������ַ�����ʾ��ʽ����������С�

		buffer.insert(0,"holler");
		System.out.println("stringbuffer �µ� insert �ַ����� :" + buffer);

		//	replace(int start, int end, String str)
		//ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ���
		
		buffer.replace(7,12,"holler");
		System.out.println("stringbuffer �µ� replace �ַ��滻 :" + buffer);
		//���¶���  Ȼ�����Ƚ�
		String buffer1 = new String(buffer);
		if(buffer1 == buffers){
			System.out.println("�� buffers �� buffer �Ƚ� buffer == buffers :" + (buffer1 == buffers));
		}else{
			System.out.println("�� buffers �� buffer �Ƚ� buffer == buffers :" + (buffer1 == buffers));
		}

		for(String name : a){
			text(name);
			
		};
		
	};

	public static void text(String name){
		System.out.println("�����Ʒ�У�" + name);
	}

}