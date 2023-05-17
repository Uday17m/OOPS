class Product {
	int Pid;
	String name;
	int price;

Product(){
	System.out.println("Product Object class Constructed");
}
void setProductDetails(int pid, String name, int price) {
	this.Pid=pid;
	this.name=name;
	this.price=price;
	
}

void showProductDetails() {
	System.out.println("Product ID: "+Pid+" ");
	
	System.out.println("Product name:\t "+name+" ");
	
	System.out.println("Product price:\t "+price+" ");


}

void setPid(int pid) {
	this.Pid=pid;
}

int getPid()
{
	return Pid;
}

class Mobile extends Product{
	String os;
	int ram;
	int sdCardSize;
	Mobile() {
		System.out.println("Mobile Object Constructed");
	}
	
	
}

public class InheritanceApp{
	public void main(String[] args) {
		
		Product product1 = new Product();
		
	product1.setProductDetails(101, "iphone", 70000);
		
		product1.showProductDetails();
		System.out.println();
		
		Product product2 = new Product();
		
		product2.setPid(Pid);
		product2.name = "Nike Shoe";
		product2.price = 5000;
		product2.showProductDetails();
		
	}
}}