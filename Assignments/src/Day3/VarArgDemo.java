package Day3;

public class VarArgDemo {

	public static void main(String[] args) 
	{
		System.out.println(average(10,20,30,40));
		
	}
	 public static double average(int... i)
		{
		 	int sum=0;
		 	for(int n:i)
		 		sum+=n;
		 		
			return sum/i.length;
		}


}
