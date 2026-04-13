class Strong
{
	public static void main(String arg[])
		{
			int n=153;
			int temp=n;
			int sum=0;
			int fact=1;
			while(n>0) {
			int digit=n%10;
			for(int i=1;i<=digit;i++)
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		if(sum==temp)
			System.out.println("strong");
		else
			System.out.println("Not strong");
						
}
		}		

