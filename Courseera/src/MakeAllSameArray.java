import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.plaf.synth.SynthStyle;

public class MakeAllSameArray {


	
	// add 1 to n-1 array to make all elemnts same
	public static long countmoves(int[] numbers){
		
		long count =0;
	
		while(!bruteforce(numbers))
		{
			
			Arrays.sort(numbers);
			numbers[numbers.length-1] = numbers[numbers.length-1]-1; 			
			count++;
		}
	
		
	return count;
	}	
		
		
		
		 public static boolean bruteforce(int[] input) {
	
			 int[] firstItemArray = new int[input.length];         
		        Arrays.fill(firstItemArray, input[0]);

		        return Arrays.equals(input, firstItemArray);
		    }

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {5,6,7};
		System.out.println(countmoves(a));
		
		
		
	}

}
