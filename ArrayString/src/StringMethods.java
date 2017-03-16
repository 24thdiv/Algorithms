
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "hello";
		System.out.println(a.substring(3));
		System.out.println(a.substring(2,4));  //end index is excusive
		
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		
		
		System.out.println(Character.getNumericValue('C'));
		System.out.println((int)'C');
	}

}
