
class bianliang 
{
	//����
		//�����  ������
		static int AGE = 10;
		//ʵ������ ������
		String name = "С��";	

		// ���ʵ������������ɼ�
		public String names;
		// ˽�б��������ڸ���ɼ�
		private double salary;

	//����
		public bianliang(String name){
			this.names = name;
		};
		//����нˮ
		public void setSalary(int setsalary){
			salary = setsalary;	
		}
		public void SetAge(){
			double Age = 3.25;	//�ֲ����� ������  
			Age = Age + AGE;
			System.out.println(name + "����" + Age + "��");

			System.out.println("ְλ��"+ names);
			System.out.println("н�ʣ�"+ salary);
		}
		public static void main(String[] args) 
		{
			bianliang Bianliang = new bianliang("�߼�����ʦ");
			Bianliang.setSalary(20);

			Bianliang.SetAge();
			
		}
}
