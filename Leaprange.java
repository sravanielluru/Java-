class Leaprange
{
	public static void main(String arg[])
		{
			for(int year=1900;year<=2026;year++) {
				if((year%400==0) || (year%4==0 && year%100!=0)) {
					System.out.println(year+ " is a leap year ");
			}
				}
		}
}		

