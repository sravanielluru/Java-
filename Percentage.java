class Percentage
{
	public static void main(String arg[])
		{
			int perc=80;
			String grade=" ";
			if(perc>=90 && perc<=100){
				grade="A";
			}
			else if(perc>=80 && perc<=90){
				grade="B";
			}
			else if(perc>=70 && perc<=80){
				grade="c";
			}
			else if(perc>=60 && perc<=70){
				grade="D";
			}
			else if(perc>=50 && perc<=60){
				grade="E";
			}
			else{
				grade="Fail";
			}	
	System.out.println(perc + "is" + grade);
		}
}


				