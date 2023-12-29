package week1.day4;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String txt="changeme",word="";
		char[] ch=txt.toCharArray();
     for(int i=0;i<ch.length;i++) 
     {
            char changeOdd=ch[i];
        		if(i%2!=0)
        		{
        			changeOdd=Character.toUpperCase(changeOdd);
        		   word=word+changeOdd;
        		   }
        		
        		  else
        			   word=word+changeOdd;
        		}
     
     System.out.print(word);
     
	}
}