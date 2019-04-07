import java.*;

class ImportDemo2 
{
	public static void main(String[] args) 
	{
		//创建两个类
		ImportDemo1 demoOne = new ImportDemo1("小明");
		ImportDemo1 demoTwo = new ImportDemo1("小白");
		//分别复制
		demoOne.demo1SetAge(20);
		demoOne.demo1SetNames("程序");
		demoOne.demo1SetSalay(20.1);
		demoOne.Demo1Println();

		demoTwo.demo1SetAge(19);
		demoTwo.demo1SetNames("销售");
		demoTwo.demo1SetSalay(10.1);
		demoTwo.Demo1Println();
		
	}
}
