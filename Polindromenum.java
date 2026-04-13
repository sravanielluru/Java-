class Polindromenum
{
	public static void main(String arg[])
		{
			int num=121;
			int rem;
			int temp=num;
			String str="";
			while(num>0) {
			rem=num%10;
			str+=rem;
			num=num/10;
			}
	
		if(temp==Integer.parseInt(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Polindrome");
						
}
		}		

