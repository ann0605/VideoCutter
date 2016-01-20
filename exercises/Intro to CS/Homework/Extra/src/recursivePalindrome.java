//
public class recursivePalindrome {
	//the second subproblem is smaller than the first problem, divide th eproblem until you reach a base case
	public static boolean isPalindrome(String s){
		if(s.length()<=1)
			return true;
		else if(s.charAt(0) != s.charAt(s.length() -1)) // base case that is when they are no longer the same
			return false;
		else 
			return isPalindrome(s.substring(1, s.length() - 1));}
	
		public static void main(String[] args){
			System.out.println("Is moon a palindrome " + isPalindrome("moon"));
		}}
			
		
