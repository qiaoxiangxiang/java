class  DataTaype2
{
	public static void main(String[] args) 
	{
        //数据类型
        System.out.println("Hello World");
        System.out.println(123);          /*数字*/
        System.out.println(true);         /*boolre*/
        System.out.println(" ");          /*null*/

        byte byteNum = 10;               /*占一个字符 -128-127*/
        short shortNum = 10250;	      /*占两个字符*/
        int intNum = 8000;		      /*占四个字符  整数默认的数据类型就是init类型*/
        long longNum = 8888888888L;			  /*占八个字符	如果long类型后面加 L 进行标识一定要加大写L  小写L和 一很像 不容易区分*/
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

		//对应数据类型的 进制 最大值 最小值
		System.out.println("byte的进制数" + Byte.SIZE);
		System.out.println("byte的最大值" + Byte.MAX_VALUE);
		System.out.println("byte的最大值" + Byte.MIN_VALUE);
		
		System.out.println("Integer的进制数" + Integer.SIZE);
		System.out.println("Integer的最大值" + Integer.MAX_VALUE);
		System.out.println("Integer的最大值" + Integer.MIN_VALUE);

		System.out.println("Float的进制数" + Float.SIZE);
		System.out.println("Float的最大值" + Float.MAX_VALUE);
		System.out.println("Float的最大值" + Float.MIN_VALUE);

		System.out.println("Long的进制数" + Long.SIZE);
		System.out.println("Long的最大值" + Long.MAX_VALUE);
		System.out.println("Long的最大值" + Long.MIN_VALUE);

		System.out.println("Short的进制数" + Short.SIZE);
		System.out.println("Short的最大值" + Short.MAX_VALUE);
		System.out.println("Short的最大值" + Short.MIN_VALUE);



		//变量名
		/*int intNum = 2000;   一个文件下只能有一个变量名*/
		/*int intNumK;		   变量名必须赋值*/

		/*声明多个变量并赋值 */
			int intNum1 = 100,intNum2 = 200, intNum3 = 300;  
			/*建议用这个*/
			int intNums1 = 2000;
			int intNums2 = 3000;


			/*先声明多个变量*/
			int int1, int2, int3;
			/*再赋值*/
			int1 = 100;int2 = 100;int3 = 100;		

		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intNum3);
		System.out.println(intNums1);
		System.out.println(intNums2);
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
	}
}