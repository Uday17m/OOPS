package JavaDocDemo;

interface MyLambda
{
	public void display();
}

class Demo 
{
	int temp = 10;  
	public void method1() {
		int count=0;
		MyLambda m1=()->{
			System.out.println("Hi");
			System.out.println("Bye"+(++temp));
		};
		m1.display();
		count++;
	}
}
public class LambdaDemo {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.method1();
	}

}
