import java.*;

class ImportDemo2 
{
	public static void main(String[] args) 
	{
		//����������
		ImportDemo1 demoOne = new ImportDemo1("С��");
		ImportDemo1 demoTwo = new ImportDemo1("С��");
		//�ֱ���
		demoOne.demo1SetAge(20);
		demoOne.demo1SetNames("����");
		demoOne.demo1SetSalay(20.1);
		demoOne.Demo1Println();

		demoTwo.demo1SetAge(19);
		demoTwo.demo1SetNames("����");
		demoTwo.demo1SetSalay(10.1);
		demoTwo.Demo1Println();
		
	}
}
