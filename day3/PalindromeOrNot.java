package week1.day3;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String input="121";
		int ch=input.length();
			String	output=" ";
		for(int i=ch-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
			if(input.equals(output)) {
				System.out.println("Palindrome");}
				else
				{
				System.out.println("Not Palindrome");
			}
			
			
		

	}

}
