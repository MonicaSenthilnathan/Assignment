package week1.day3;


public class IsPrimeNumber {

	public static void main(String[] args) {
		int i,flag=0,num=5;
		
		if(num==0||num==1) {
			System.out.println(num+"Not Prime");
		}
			for(i=2;i<=num/2;i++)
		 {
			if(num%i==0) {
				System.out.println(num+"Not Prime");
				flag=1;
				break;
			}
				
		}
			if(flag==0) {
				System.out.println(num+" Prime");
			}
	}
}
