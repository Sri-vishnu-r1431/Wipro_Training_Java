package admin;

public class Arrays14 {
	public static void main(String[] args) {
		int [][]arr=new int[3][3];
		int k=0;
		if(args.length<9) System.out.println("Please enter 9 integers");
		else {
			int Max_val=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j]=Integer.parseInt(args[k++]);
					if(arr[i][j]>Max_val) {
						Max_val=arr[i][j];
					}
				}
			}
			System.out.println("The given array is:");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+Max_val);
		}
		
	
	}
}