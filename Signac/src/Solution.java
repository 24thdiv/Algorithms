import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Solution {

	
	
	
	// f and m array make a pair of same elements
	public static int[] sol(int f[], int m[]){
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		HashMap<Integer,Integer> arrf = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> arrm = new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<f.length;i++){
			
			if(arrf.containsKey(f[i])){
				arrf.put(f[i],arrf.get(f[i])+1);
				
				
				
			}
			else{
				arrf.put(f[i], 1);
			}
			
		}
		
		for(int i=0;i<m.length;i++){
			
			if(arrf.containsKey(m[i])){
				int value = arrf.get(m[i]);
				if(value!=0){
					if(arrm.containsKey(m[i])){
						arrm.put(m[i],arrm.get(m[i])+1);
					}
					else{
						arrm.put(m[i],1);
					}
					arrf.put(m[i],value-1);
				}
				
			}
			
			
		}
		
		
		Iterator it = arrm.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		 
		        int values = (int) pair.getValue();
		        for(int i=0;i<values;i++)
		        	ans.add((Integer) pair.getKey());
		        
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		
		
		  Collections.sort(ans,Collections.reverseOrder());
		  
		  int[] answer = new int[ans.size()];
		  
		  for(int i =0;i<ans.size();i++){
			  
			  answer[i]=ans.get(i);
		  }
		  
		    
		return answer;
	}
	
	
	
	public static void main(String[] args) {
	
		
		int f[]={10670,11057,16111,17203,16390,8500,7551,11517,12848,6988,17875,11751,8500};
		int[] m={14376,17203,16797,8350,8500,7155,12365,16111,16111,17875,13115,10048,8500};
		
		int[] ans = sol(f, m);
		System.out.println(ans);
		
	}

}
