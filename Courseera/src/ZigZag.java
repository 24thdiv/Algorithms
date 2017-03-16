import java.util.ArrayList;
import java.util.Collections;

public class ZigZag{
	
	
	// convert array to zig zag form
	//smallest largest smaller larger.....
	static int[] wiggleArrangeArray(int[] intArr) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
       int[] ans = new int[intArr.length];
       for(int i = 0; i < intArr.length; ++i){
           temp.add(intArr[i]);
       }
       int even = 1;
       for(int i = 0; i < intArr.length; ++i){
           if (even == 1){
              
               int max = Collections.max(temp);
               ans[i] = max;
               temp.remove(temp.indexOf(max));
               even = 0;
           } else {
            
               int min = Collections.min(temp);
               ans[i] = min;
               temp.remove(temp.indexOf(min));
               even = 1;

           }
       }
       return ans;
   }


	
	
	
	
	public static void main(String[] are){
		
		int[] intArr={1,5,3,2,4,8};
		int ans[] = wiggleArrangeArray(intArr);
		for(int i:ans){
			System.out.println(i);
		}
		
	}
	
	
}