class Armstrong
{
	public static void main(String arg[])
		{
			int n=153;
			int temp=n;
			int sum=0;
			int digits=0;
			int num=n;
			while(num>0) {
			digits++;
			num=num/10;
			}
			num=n;
			while(num>0) {
			int rem =num%10;
			sum+=Math.pow(rem,digits);
			num=num/10;
			}
	
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
						
}
		}		

