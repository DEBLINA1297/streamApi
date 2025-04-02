package DAY1;

abstract interface Amazonprime
{
	public abstract void watch();
	

}
class Webseries  implements Amazonprime
{
	public void watch()
	{
		System.out.println("Asur");
	}
	
}
class Movie implements Amazonprime
{
	public void watch()
	{
		System.out.println("Veerzara");
	}
	
}
class Singlepoint
{
	static void spc( Amazonprime s)
	{
		s.watch();
	}
}
class Abstraction1
{
	public static void main(String[] args) {
	Webseries w=new Webseries()	;
	Movie m=new Movie();
	Singlepoint.spc(w);
	Singlepoint.spc(m);
	}
}