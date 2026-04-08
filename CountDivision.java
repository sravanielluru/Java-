class CountDivision
{
	public static void main(String arg[])
		{
			int num=10;
			int divisor=3;
			int count=0;
			for(int i=1;i<=num;i++) {
				if(i%divisor==0)
					count++;
			}
		System.out.println(count);
		}
}		

