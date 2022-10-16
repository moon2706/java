import java.util.*;

class Grade{
	public static void main(String args[]){
		char grade;
		int gp = Integer.parseInt(args[0]);
		switch (gp){
			case 10 : System.out.println("S"); break;
			case 9 : System.out.println("A+"); break;
			case 8 : System.out.println("A"); break;
			case 7 : System.out.println("B+"); break;
			case 6 : System.out.println("B"); break;
			case 5 : System.out.println("C"); break;
			case 0 : System.out.println("F"); break;
			default : System.out.println("Invalid grade point..."); break;
		}
	}
}