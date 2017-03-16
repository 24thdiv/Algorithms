
public class ReachingPoint {

	
	
	// two points a,b are give need to reach destination x,y from adding a and b  
    public static void main(String args[]){
        System.out.println(canReach(4,4,28,12));
    }

    static String canReach(int a, int b, int c, int d){
        
        if(c<a || d<b)
            return "No";
        if(gcd(a,b) == gcd(c,d))
            return "Yes";
        else
            return "No";
        
    }

    static int gcd(int a, int b){
        while (a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
}