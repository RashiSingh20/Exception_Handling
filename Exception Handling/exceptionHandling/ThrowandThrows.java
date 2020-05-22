package exceptionHandling;

public class ThrowandThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
func1();              //called
	}
	static void func1() {
		int a=5;
		int b=3;
		System.out.println(a/b);             // printed this
		try {
		Thread.sleep(3000);                     //will sleep for 3000 ms then will execute further    //now called knows func2 can throw
		}
		catch(InterruptedException e) {  
			e.printStackTrace();
			//System.out.println(e.getMessage()+"occured");
		}
		System.out.println("after delay");
	}
	static void funcn2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was coming");
		}
	}

}
