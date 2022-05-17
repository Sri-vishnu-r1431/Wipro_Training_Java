package admin;

public class FlowControl15 {
	public static void main(String[] args) {
		if(args.length>0) {
		int size=Integer.parseInt(args[0]);
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		}
		else {
			System.out.println("Please enter an integer number");
		}
	}
}
