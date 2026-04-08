class CountDivision2
{
	public static void main(String arg[])
		{
			int num=20;
			int divisor=5;
			int count=0;
			for(int i=1;i<=num;i++) {
				if(i%divisor==0 && i%10!=0)
					count++;
			}
		System.out.println(count);
		}
}		

