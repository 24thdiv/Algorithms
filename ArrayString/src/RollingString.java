import java.util.Scanner;

public class RollingString {

	
	// need to role like if you give L 0 0 then roll left from 0 to 0 .
	// if R 0 2 then roll right elemts 0 to 2
	// here right roll means 'a' the 'b', 'z' then 'a'
	// right roll means 'a' then 'z' ,  'b' then 'a'
	public static String rolling(String s,String[] opration){
		

		int no_op=opration.length;
        int x[] = new int[no_op];
        int y[] = new int[no_op];
        String op[] = new String[no_op];
        char[] str = s.toCharArray();
        int temp=0;
        String[] te =null;
        int index=0;
        for(int i=0;i<opration.length;i++){

        	te = opration[i].split(" ");
            
            x[i] = Integer.parseInt(te[0]);
            
            y[i] = Integer.parseInt(te[1]);
            op[i] = te[2];
            index++;
        }

        for(int i=0;i<x.length;i++){

            if(op[i].equals("R")){

                for(int j=x[i];j<=y[i];j++){

                    if(str[j]=='z')
                        str[j] = 'a';
                    else {


                        System.out.println(str[j]);
                        str[j] = (char) (str[j] + 1);
                        System.out.println(str[j]);

                    }
                }

            }
            else if(op[i].equals("L")){

                for(int j=x[i];j<=y[i];j++){

                    if(str[j]=='a')
                        str[j] = 'z';
                    else {


                        System.out.println(str[j]);
                        str[j] = (char) (str[j] - 1);
                        System.out.println(str[j]);

                    }
                }

            }

            System.out.println("After Loop "+i);
            System.out.println(str);
        }

        return new String(str);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String op[] = new String[3];
		for(int i=0;i<3;i++){
			op[i] = in.nextLine();
		}
		
		String ans=rolling("abc", op);
		System.out.println(ans);
	}

}
