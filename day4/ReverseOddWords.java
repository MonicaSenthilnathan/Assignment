package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		String str="I am a software tester";
		String[] first = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < first.length; i++)
	        {
	           String second = first[i]; 
	           String reverseWord = "";
	     
	           for (int j = second.length()-1; j >= 0; j--) 
		   {
	        	  
			reverseWord = reverseWord + second.charAt(j);
			
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		
		System.out.println(reversedString);
	   }
	
	}
		
	


