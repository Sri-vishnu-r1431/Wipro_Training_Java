package admin;

public class ClassesAndObjects3 {
	public static void main(String[] args) {
	Author auth=new Author("Vishnu","vishnu@gmail.com",'M');
	Book book=new Book("Man ThinkEth",auth,45,45.00);
	System.out.println(auth+" "+book);
	}
}
class Author{
	String name,email;
	char gender;
	Author(String name,String email,char gender){
		
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Author: name = " + name + ",email = " + email + ",gender = " + gender;
	}
}
class Book{
	String name;
	Author author;
	int qtyInStock;
	double price;
	Book(String name,Author author,int qtyInStock,double price) {
		super();
		this.name=name;
		this.author=author;
		this.qtyInStock=qtyInStock;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book : name = " + name + "\nauthor = " + author + "\nprice = " + price + ", qtyInStock = " + qtyInStock;
	}
	
}