import java.*;

public class ImportDemo1 
{
	String name;
	int age;
	String names;
	double salay;
	//设置 name值
	public ImportDemo1 (String name){
		this.name = name;
	}
	//设置 age值
	public void demo1SetAge (int setage){
		age = setage;
	}
	//设置 names值
	public void demo1SetNames (String setnames){
		names = setnames;
	}
	//设置 salay值
	public void demo1SetSalay (double setsalay){
		salay = setsalay;
	}

	public  void Demo1Println() 
	{
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("职位名称："  +names);
		System.out.println("薪资：" + salay);
	}
}
