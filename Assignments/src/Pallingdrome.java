
public class Pallingdrome {

	public static void main(String[] args) {
		
		String s="hello";
		
		System.out.println(isPallingdrome(s));

	}

	private static boolean isPallingdrome(String s) {
		int start=0;
		int end=s.length()-1;
		
		while(start<end)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				return true;
			}
			start++;
			end--;
		}
		
		return false;
	}

}
