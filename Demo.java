import java.util.*;

class Demo{
	public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter name: ");
	String name = obj.nextLine();
	
	System.out.print("Enter Age:");
	int age = obj.nextInt();
	
	System.out.print("Enter avg marks:");
	float avg = obj.nextFloat();
	
	System.out.println();
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Avg = "+avg);
	}
}