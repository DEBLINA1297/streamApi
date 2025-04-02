package DAY1;
class Mother
{
	String S="Mom";
}
 class Beta extends Mother {
void family()
{
	System.out.println("I miss you ma");
}
}
 class Daughter extends Mother {
void family()
{
	System.out.println("I miss you too ma");
}
}
 class HEIRARCHICAL
 {
	 public static void main(String[] args) {
		Daughter d= new Daughter();
		d.family();
	System.out.println(d.S);
		Beta b=new Beta();
		b.family();
		System.out.println(b.S);	
	}
 }