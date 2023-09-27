//Overloading to interface 
package Hello;
interface Calculator {
    int add(int a, int b);
}
class BasicCalculator implements Calculator      // Create a class that implements the Calculator interface
{
    @Override                                    // Overloaded method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {        // Overloaded method 2: Add three integers
        return a + b + c;
    }
}
public class Methodoverloadinginterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BasicCalculator calculator = new BasicCalculator();
	        int sum1 = calculator.add(5, 10);                       // Call the first add method (from the interface)
	        System.out.println("Sum of two integers: " + sum1);
	       	int sum2 = calculator.add(5, 10, 15);                   // Call the second add method (overloaded in the class)
	        System.out.println("Sum of three integers: " + sum2);
	}
}
