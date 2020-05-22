package exceptionHandling;
import java.util.*;
public class HackerrankProb {
	
	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(MyCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

	
	}

}
class MyCalculator {

   static int   power(int n, int p) throws Exception{
int c = (int) Math.pow(n,p);

    
   
    if(n<0 || p<0){
        throw new Exception("n or p should not be negative.");
    }
    else if(n==0 && p==0){
        throw new Exception("n and p should not be zero.");
    }
    else{
    return c;
    }
   
    } 
}

