package week1.day4;

import java.util.Arrays;

public class RemoveDupicateWord {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		
		//char[] ch=text.toCharArray();
		int count=0;
		String[] str=text.split(" ");
		//System.out.println(str);
		//int str=text.length();
		for(int i=0;i<str.length;i++) {
			for (int j=1;j<i;j++) {
				if(str[i].equals(str[j])) {
					count++;
					
					//System.out.println(str[j]);
					//break;
				
				if(count>=1) {
	str[i]=" ";				
				//	System.out.println(str[j]);	
				}
				}
				
			}}
			System.out.println(Arrays.toString(str));
			
			
		
//		
//		String output=" ";
//		//String[] str=text.split("\\s ");
//		for(int i=0;i<text.length();i++) {
//		
//		
//			for (int j=0;j<i;j++) {
//				if (text.charAt(i) != output.charAt(j)) {
//                    output = output + text.charAt(i);
//				}
//			}
//			//System.out.println(output);
//		
//	}
//		System.out.println(output);
		}

}
