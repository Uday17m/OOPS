package JavaDocDemo;
@interface MyAnno{
	
	String name();
	String project();
	String date() default "today";
	String version() default "13";
	
}
@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo {
	int data;
	
	public static void main(String[] args)
	{
		
		int x;
	}


}
