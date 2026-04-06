class Smallestofthree
{
	public static void main(String arg[])
		{
			int a=20;
			int b=12;
			int c=18;
			if(a<b)
			{
				if(a<c){
				System.out.println(a + "is small");
	
				}
				else{
					System.out.println(c + "is small");
					}
			}
			else{
				if(b<c){
					System.out.println(b + "is small");
				}
				else{
					System.out.println(c + "is small");
					}

			     }	
		}
}
