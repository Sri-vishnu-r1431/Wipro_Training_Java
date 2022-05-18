package admin;
public class ClassesAndObjects1 {
	public static void main(String[] args) {
		Box b1=new Box(10,12,15);
		System.out.println("The depth of the Box is:"+b1.depth);
		System.out.println("The height of the Box is:"+b1.height);
		System.out.println("The width of the Box is:"+b1.width);
		System.out.println("The volume of the Box is:"+b1.getVolume());
	}
}
class Box{
	int height,depth,width;
	Box(int height,int width,int depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	int getVolume() {
		return this.width*this.depth*this.height;
	}
}
