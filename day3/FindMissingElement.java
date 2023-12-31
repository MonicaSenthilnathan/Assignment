package week1.day3;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] array1= {1, 4,3,2, 6, 7};
	     Arrays.sort(array1);
		int x=1;
		for(int i=0;i<array1.length;i++) {
		if(x!=array1[i]) {
			System.out.println(x);
			break;
		
		}x++;
		}
		

	}

}
