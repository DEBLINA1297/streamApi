package DAY1;

 class  Inh
	 {
protected int a=200;
int b=300;
	  
	 }
	 class Father extends Inh {
	 int b=400;
	 	
	 }
	 class Son extends Father
	 {
		// int b=400;
		// b=500;
	 	 void love1()
	 	{
	 		System.out.println("Hi i am son");
	 	}
	 }
	 class Inheritance1
	 {
	 	public static void main(String[] args) {
	 		Son s=new Son();
	 		s.love1();
	 		System.out.println(s.a);
	 		System.out.println(s.b);
	 	}
	 }

