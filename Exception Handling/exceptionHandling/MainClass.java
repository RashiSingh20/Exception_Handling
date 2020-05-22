package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		try {
		int a[] = new int[5];
		System.out.println(a[6]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + "occured please check your code");
		}
		catch(ArrayIndexOutOfBoundsException e) {    //catches this esception and would come out of all catches
			System.out.println("index should be in the range of 0 to sixe of array");
		}
		catch(IllegalArgumentException e) {
			System.out.println("check your casting");
		}
		finally {
			System.out.println("sorry for incovinience");
		}
		
		System.out.println("very important code");
		System.out.println("needs to run");
	
	}
}
