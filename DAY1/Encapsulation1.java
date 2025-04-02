package DAY1;

 class Encapsulation {
private int password=99;
public int getPassword()
{
	return password;
}
public void setPassword(int password )
{
	this.password=password;
}

 }
 class Encapsulation1
{
	public static void main(String[] args) {
		

		 Encapsulation a=new  Encapsulation()	;
		 System.out.println(a.getPassword());
		 a.setPassword(22);
		 System.out.println(a.getPassword());
	

	}

}