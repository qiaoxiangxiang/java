class XiuShiFu 
{
	// 4中修饰
	//修饰符	 当前类	 同一包内	子孙类(同一包)	子孙类(不同包)	  其他包
	//public		Y		Y			Y				Y				Y
	//protected		Y		Y			Y				Y/N（说明）		N
	//default		Y		Y			Y				N				N
	//private		Y		N			N				N				N

	//public 通用的类  所有的类或方法都可以使用
	//protected  只能在当前类下的子类去使用；其他的类不能使用（详细查看）
	//default	限制于 当前类 同一包 下；

	//static 静态变量：
	//static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。
	//        局部变量不能被声明为 static 变量。
	//静态方法：
	//static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
	

	//父级方法
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
