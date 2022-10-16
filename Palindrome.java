import java.util.*;

class Palindrome{
	public static void main(String args[]){
		String s;
		s = args[0];
		int i=0;
		int j=s.length()-1;
		for(i=0;i<j;i++,j--){
			if (s.charAt(i)!=s.charAt(j)){
				System.out.println("Not a palindrome");
				return ;
			}
			
		}
		System.out.println("Palindrome");
		
	}
	
}