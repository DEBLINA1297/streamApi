package DAY1;

interface Football
{
	void play();
}
interface Cricket
{
	void play1();
}
class Playing implements Football,Cricket
{
	public void play() {
		System.out.println("Ronaldo");
	}
	public void play1()
	{
		System.out.println("Virat");
	}
}
public class Multiple {
public static void main(String[] args) {
	Playing p=new Playing();
	p.play();
	p.play1(); 
}
}
