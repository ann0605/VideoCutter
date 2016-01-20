import java.util.Scanner;

public class computeFactorial {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The factorial of " + n + "is" + factorial(n));
		
		
	}
	public static long factorial(int n){
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);}
	
}
