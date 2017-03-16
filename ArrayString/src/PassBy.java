

class School{
	
	int value;
	String name;

	public School(int v, String n){
		value = v;
		name= n;		
	}

	
	public void change(School s){
		
		s.value = 100;
		s.name="Changed";
		
	}
	
	public void changeint(int a){
		
		a= a+20;
		
	}
	
}



public class PassBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	School sc = new School(0, "hello");
	sc.change(sc);
	System.out.println(sc.value);
	System.out.println(sc.name);
	
	int a =10;
	sc.changeint(a);
	System.out.println("a= "+a);
	}

}
