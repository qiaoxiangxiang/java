
class bianliang 
{
	//变量
		//类变量  方法外
		static int AGE = 10;
		//实例变量 方法外
		String name = "小白";	

		// 这个实例变量对子类可见
		public String names;
		// 私有变量，仅在该类可见
		private double salary;

	//方法
		public bianliang(String name){
			this.names = name;
		};
		//设置薪水
		public void setSalary(int setsalary){
			salary = setsalary;	
		}
		public void SetAge(){
			double Age = 3.25;	//局部变量 方法内  
			Age = Age + AGE;
			System.out.println(name + "今年" + Age + "岁");

			System.out.println("职位："+ names);
			System.out.println("薪资："+ salary);
		}
		public static void main(String[] args) 
		{
			bianliang Bianliang = new bianliang("高级工程师");
			Bianliang.setSalary(20);

			Bianliang.SetAge();
			
		}
}
