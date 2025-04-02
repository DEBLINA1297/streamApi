package DAY3;

public class Exception {
	public static void main(String[] args) {
		try {
		int i=100/200;
		System.out.println(i);
		String s=null;
		System.out.println(s.length());
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("exception occured");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("nullpointer occured");
		}
	}

}
