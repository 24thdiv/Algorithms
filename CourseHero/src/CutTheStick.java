import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class CutTheStick {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<Integer> al=new ArrayList<>();
	    HashSet<Integer> aa = new HashSet<>();
	    
	    
	    
	    for(int i=0; i<n; i++){
	        int a=sc.nextInt();
	        al.add(a);
	    }
	    Collections.sort(al);
	    //remove elements after reducing to zero
	    for(int i=0; i<al.size(); i++){
	        if(al.get(0)==0){al.remove(0); i=-1; continue;}
	        System.out.println(al.size());
	        int min=al.get(0);
	        for(int j=0; j<al.size(); j++){       
	            al.set(j, al.get(j)-min);
	        }
	    }
	}

}
