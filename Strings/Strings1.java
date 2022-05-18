package admin;

import java.util.Scanner;

public class Strings1 {
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i++ < j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		if (isPalindrome(s1)) {
			System.out.println("The given string is Palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}
		s.close();
	}

}
