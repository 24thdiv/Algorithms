import java.lang.reflect.Array;
import java.util.Arrays;

public class FidessaAirport {


	public int gates(int[] arrivals, int[] departures, int flights){
		
		
		int result = 1, gates = 1;
        Arrays.sort(departures);
        int arr = 1, dept = 0;
        while(arr < flights && dept < flights){
            if(arrivals[arr] <= departures[dept]){
                gates++;
                arr++;
                result = Math.max(gates, result);
            }else{
                gates--;
                dept++;
            }
        }
        return result;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
