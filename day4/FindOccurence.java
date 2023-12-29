package week1.day4;

public class FindOccurence {

	public static void main(String[] args) {
		String txt="Testeaf";
		int a=0;
		char occur[]=txt.toCharArray();
		for(int i=0;i<occur.length;i++) {
			char ch=occur[i];
			if(ch=='e')
				a++;
		}
		System.out.println(a);
	}
}
