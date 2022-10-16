import java.util.*;
class Scan{
	public static void main(String args[]){
	int a,b,c;
	float avg;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. 1 value: ");
	a = sc.nextInt();
	System.out.println("Enter no. 2 value: ");
	b = sc.nextInt();
	System.out.println("Enter no. 3 value: ");
	c = sc.nextInt();
	
	avg = (a+b+c) / 3.0f;
	System.out.println("The avg is "+avg);
	}
}