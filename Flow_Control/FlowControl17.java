package admin;

public class FlowControl17 {
	public static boolean isPalindrome(String s1) {
		int j=s1.length()-1,i=0;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			++i;
			--j;
		}
		return true;
	}
	public static void main(String[] args) {
		if(isPalindrome(args[0])) {
			System.out.println(args[0]+" is a Palindrome");
		}
		else {
			System.out.println(args[0]+" is not a Palindrome");
		}
	}
}
