package DAY1;

 class GrandFather {
int a=10;
}
class Father1 extends GrandFather 
{
	void love()
	{
		System.out.println("Love you papa");
	}
}
class SingleLevel
{
public static void main(String[] args) {
	Father1 f=new Father1();
	f.love();
	System.out.println(f.a);
}	
}