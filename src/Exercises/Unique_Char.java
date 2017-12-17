package Exercises;

public class Unique_Char {

	public static void main(String[] args) {
		String s = "sandeep belgaonkar";
		s=s.replaceAll(" ", "");
		char c[] = s.toCharArray();		
		String u = "";
		for (int i=0; i<c.length; i++){
			if(u.indexOf(c[i])<0){
				u=u+c[i];
			}
		}
		System.out.println(u);

	}

}
