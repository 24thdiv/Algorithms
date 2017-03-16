

/*McDonald’s sells Chicken McNuggets in packages of 6, 9 or 20 McNuggets.
  Thus, it is possible, for example, to buy exactly 15 McNuggets
  (with one package of 6 and a second package of 9), but it is not possible
  to buy exactly 16 McNuggets, since no non- negative integer combination of 6's, 9's and 20's
  add up to 16. To determine if it is possible to buy exactly n McNuggets, one has to find
  non-negative integer values of a, b, and c such that 
	6a+9b+20c=n 
	Write a function, called McNuggets that takes one argument, n, and returns True if it is possible to buy a combination of 6, 9 and 20 pack units such that the total number of McNuggets equals n, and otherwise returns False. Hint: use a guess and check approach.
*/

class Nuget{
	
	public boolean nuggets(int n){
		
		if(n==0) return true;
		if(n<1) return false;
		
		if((n%6==0) || (n%9==0) || (n%20==0)) return true;
		
		return nuggets(n-6) || nuggets(n-9) || nuggets(n-20);
		
		
	}
	
}



public class MacDNuggetAmazon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nuget ng = new Nuget();
		System.out.println(ng.nuggets(16));
		System.out.println(ng.nuggets(33));
		
		
	}

}
