class ZiJi extends XiuShiFu
{
	public ZiJi(){};
	
	public static void main(String[] args) 
	{
		ZiJi ziji = new ZiJi();
		// extends 是 子集 ZiJi 继承 XiuShiFu 的方法

		// setAge 是父级 XiuShiFu 中的方法
		System.out.println("最初值"+ziji.setAge());
		for(int i = 0;i < 200 ; i++){
			ziji.AddAge();
		}
		System.out.println("循环后的值"+ziji.setAge());
	}
}