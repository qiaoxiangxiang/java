public class DataType {
	//int  基本数据类型
	int DogAge;
	//给类构造一个方法  构造的方法名 必须与 类 同名
	public DataType(String name) {
		System.out.println("小狗的名字是："+name); 
	};

	//设置  赋值
	public void setAge(int ageNum){
		DogAge = ageNum;
	}
	//获取  值
	public int getAge(){
		System.out.println("小狗的年龄是:" + DogAge);
		return DogAge;
	}


	public static void main(String[] args) {
		//类型
		System.out.println("小狗的名字是："); //string 
		System.out.println(123123); // number
		System.out.println(true);   //booler
		System.out.println(" ");    //null
		//创建 对象
		DataType DogName = new DataType("tome");
		//通过方法设置对象
		DogName.setAge(10);
		//通过方法获取对象
		DogName.getAge();
		//直接访问成员变量
	    System.out.println("直接访问方法下的成员变量" + DogName.DogAge);
	}
	
}
