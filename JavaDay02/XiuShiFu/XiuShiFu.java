class XiuShiFu 
{
	// 4������
	//���η�	 ��ǰ��	 ͬһ����	������(ͬһ��)	������(��ͬ��)	  ������
	//public		Y		Y			Y				Y				Y
	//protected		Y		Y			Y				Y/N��˵����		N
	//default		Y		Y			Y				N				N
	//private		Y		N			N				N				N

	//public ͨ�õ���  ���е���򷽷�������ʹ��
	//protected  ֻ���ڵ�ǰ���µ�����ȥʹ�ã��������಻��ʹ�ã���ϸ�鿴��
	//default	������ ��ǰ�� ͬһ�� �£�

	//static ��̬������
	//static �ؼ����������������ڶ���ľ�̬����������һ����ʵ�������ٶ������ľ�̬����ֻ��һ�ݿ����� ��̬����Ҳ����Ϊ�������
	//        �ֲ��������ܱ�����Ϊ static ������
	//��̬������
	//static �ؼ����������������ڶ���ľ�̬��������̬��������ʹ����ķǾ�̬��������̬�����Ӳ����б�õ����ݣ�Ȼ�������Щ���ݡ�
	

	//��������
	public XiuShiFu (){
		
	};
	protected int nums = 0;
	protected int setAge(){
		return nums;
	};
	protected int AddAge(){
		return nums++;
	}
	
	public static void main(String[] args) 
	{
		
	}
}
