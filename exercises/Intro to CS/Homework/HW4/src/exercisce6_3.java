import javax.swing.JOptionPane;
public class exercisce6_3 {
	public static void main(String[] args){
		int newNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number:"));
		if (isPalindrome(newNum)){
			System.out.println("Your numbers is a palindrome!");}
		else{
			System.out.println("Your number is not a palindrome!");}
	}
	public static int reverse(int number){
		int temp, count = 0;
		String answer = "";
		temp = number;
		while(temp!=0){
			temp/=10;
			count++;
		}
		int[] myIntArray = new int[count];
		for (int i = 0;i< count; i++ ){
			
			myIntArray[i] = number%10;
			
			number/=10;
			
		}
		for (int j = 0; j< count; j++){
			answer+=Integer.toString(myIntArray[j]);
		}
		
		return Integer.parseInt(answer);
		
	}
	public static boolean isPalindrome(int number){
		if(reverse(number) == number)
			return true;
		return false;
	}

}