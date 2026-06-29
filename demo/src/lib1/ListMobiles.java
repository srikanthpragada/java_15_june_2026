package lib1;

public class ListMobiles {
	
	// Valid mobile number is made of 10 digits 
	public static boolean isValidMobile(String mobile) {
	    if(mobile.length() != 10)
	    	return false; 
	    
	    // check whether string contains only digits 
	    for(int i = 0; i < mobile.length(); i ++) {
	    	char ch = mobile.charAt(i);
	    	if (!(ch >= 48 && ch <= 57))  // not a digit 
	    		 return false; 
	    }
	    	
	    return true;
	}

	public static void main(String[] args) {
		 String data = "9898989898,4545444,9059057000,9090k08876,3737373";
		 
		 String mobiles [] = data.split(",");
		 
		 for(String mobile : mobiles) {
			 if(isValidMobile(mobile))
				 System.out.println(mobile);
		 }
			 
	}

}
