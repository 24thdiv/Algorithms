import java.util.regex.Pattern;

class solution{
	
	static String pattern= "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";;
	String ip;
	Pattern pat;
	
	public solution(String iP){
		
		pat = Pattern.compile(pattern);
		this.ip=iP;
		
	}
	
	public boolean isMatch(){
		
		return pat.matcher(ip).matches();
				
		
	}
	
	
}

