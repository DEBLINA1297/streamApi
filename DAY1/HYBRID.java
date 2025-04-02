package DAY1;
interface A
{
	void atom();
}
class Chemistry
{
	int a=2;
}
class Chemistry1 extends Chemistry implements A
{
	int b=4;

	//@Override
	public void atom() {
		// TODO Auto-generated method stub
		
	}
}
class Organic extends Chemistry1 
{
	
	void reaction() {
		System.out.println("Carbon");
	}

	//@Override
	public void atom() {
		// TODO Auto-generated method stub
		
	}
}
class Inorganic extends Chemistry1
{
	void reaction1() {
		System.out.println("Metal Bond");
	}
}

public class HYBRID {
public static void main(String[] args) {
	Organic o=new Organic();
	o.reaction();
	System.out.println(o.a);
	System.out.println(o.b);
	Inorganic i=new Inorganic();
	i.reaction1();
	System.out.println(i.a);
	System.out.println(i.b);
}
}
