class YunSuanFu 
{
	public static void main(String[] args) 
	{
		int a = 5;//����һ��������
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
		// b++ ����ǰֵΪ5  ������Ϻ� b++��ִ�� b= b+1; ��� y = 5; b = 6;
        System.out.println("���������ǰ׺�����a="+a+",x="+x);
        System.out.println("�����������׺�����b="+b+",y="+y);
	}
}
