import java.*;

public class ImportDemo1 
{
	String name;
	int age;
	String names;
	double salay;
	//���� nameֵ
	public ImportDemo1 (String name){
		this.name = name;
	}
	//���� ageֵ
	public void demo1SetAge (int setage){
		age = setage;
	}
	//���� namesֵ
	public void demo1SetNames (String setnames){
		names = setnames;
	}
	//���� salayֵ
	public void demo1SetSalay (double setsalay){
		salay = setsalay;
	}

	public  void Demo1Println() 
	{
		System.out.println("���֣�" + name);
		System.out.println("���䣺" + age);
		System.out.println("ְλ���ƣ�"  +names);
		System.out.println("н�ʣ�" + salay);
	}
}
