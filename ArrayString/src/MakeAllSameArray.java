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
	
	
	 static long countMoves(int[] numbers) {
	        int min = Integer.MAX_VALUE;
	        long sum = 0;
	        
	        for(int i = 0; i < numbers.length; i++){
	            sum += numbers[i];
	            
	            if(min > numbers[i]){
	                 min = numbers[i];  
	            }
	        }
	        
	        return Math.abs( sum - (numbers.length*min) ) ;
	         
	    }
	 
	 
	 /// 1
	 static int minMoves1(int[] avg) {
	        int left = 0;
	        int count = 0;
	        for(int i = 0; i < avg.length; i++){
	            if(avg[i] == 1){
	                count += i - left;
	                left++;
	            }
	        }
	        return count;
	    }
	 
	 
	 
	 //
	 static int minMoves2(int[] avg) {
	        
	        int left = 0;
	        int count = 0;
	        
	        for(int i = 0; i < avg.length; i++){
	            
	            if(avg[i] == 1){
	                count += i - left;
	                left++;
	            }
	        }
	        
	        int right = 0;
	        int count2 = 0;
	        
	        for(int i = 0; i < avg.length; i++){
	            
	            if(avg[i] == 0){
	                count2 += i - right;
	                right++;
	            }
	        }
	        return Math.min(count, count2);
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
