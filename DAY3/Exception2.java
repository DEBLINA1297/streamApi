package DAY3;

public class Exception2 {

	public static void main(String[] args) throws RuntimeException  {
		// TODO Auto-generated method stub
		try {
			int i = 100 / 200;
			System.out.println(i);
			String s = null;
			System.out.println(s.length());
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("exception occured");
			throw new RuntimeException("throw from Catch block");
		}
		
			
		}
		
	}


