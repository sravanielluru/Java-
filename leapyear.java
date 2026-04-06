class Leapyear
{
	public static void main(String arg[])
		{
			int a=2020;
			if((a%400==0) || (a%4==0 && a%100!=0))
			{
				System.out.println(a + "is leap year");
			}
			else{
				System.out.println(a + "is not a leap year");
			     }	
		}
}
