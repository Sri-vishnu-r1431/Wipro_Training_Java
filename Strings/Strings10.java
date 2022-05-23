import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String []a=s.next().split(",");
	String val=a[0];
	int times=Integer.parseInt(a[1]);
	String fin="";
	for(int i=0;i<times;i++){
	    fin+=val.substring(val.length()-times);
	}
	System.out.println(fin);
	s.close();
	}
}
