class Switchweeks
{
	public static void main(String arg[])
		{
			int day=3;
			System.out.println(switch(day){
			case 0,3->"Weekends";
			case 1,2,4,5->"Weekdays";
			default->"Invalid day";
			});
		}
}








				