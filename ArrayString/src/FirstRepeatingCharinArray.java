import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharinArray {


	public static int firtRepeating(int arr[]){
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
	
		for(Integer a : arr )
		{
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			}
			else{
				map.put(a, 1);
			}
		}
		
		for(Integer a:arr){
			
			if(map.get(a)>1){
				return a;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,2,1,3,3,2};
		System.out.println(FirstRepeatingCharinArray.firtRepeating(a));
		
	}

}
