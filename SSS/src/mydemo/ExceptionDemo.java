package mydemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			throw new MyException("prashant");

		} catch (MyException ex) {
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}

	}

}
