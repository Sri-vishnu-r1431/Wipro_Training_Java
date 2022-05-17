package admin;

public class Arrays6 {
public static void main(String[] args) {
			
			int [] arr= {12,81,9 ,0,1,24,45,10,5};
			int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	
}
