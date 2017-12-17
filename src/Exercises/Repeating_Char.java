package Exercises;

public class Repeating_Char {

	public static void main(String[] args) {
		String s = "sandeep belgaonkar";
		s=s.replaceAll(" ", "");		
		char c[] = s.toCharArray();
	    System.out.println(c.length);
	    int count=0;
	    for(int i=0; i<c.length; i++){
	    	for(int j=0; j<c.length; j++){
	    		if(c[i]==c[j]){
	    			count+=1;
	    		}
	    	}
	    	System.out.println("The count of "+c[i]+" is "+count);
	    	count=0;
	    }
	   

	}

}
