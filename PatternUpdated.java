import java.util.*;

class PatternUpdated{
	public static void main(String args[]){
		int a=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		n = sc.nextInt();
		
		for (int i=0;i<=n;i++){
			for (int j=0;j<i;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println("");
		}
	
	}
}