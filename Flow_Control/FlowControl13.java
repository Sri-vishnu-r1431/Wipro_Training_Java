package admin;

public class FlowControl13 {
	public static boolean isPrime(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("The Prime Numbers are:");
		for(int i=10;i<=99;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
