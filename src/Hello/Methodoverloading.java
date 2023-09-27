package Hello;
public class Methodoverloading {               
		// Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }
	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	    // Method to add two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }
	    public static void main(String[] args) {
	    Methodoverloading example = new Methodoverloading();
	       
	        int sum1 = example.add(5, 10);                         // Call the first add method
	        System.out.println("Sum of two integers: " + sum1);

	        int sum2 = example.add(5, 10, 15);                     // Call the second add method
	        System.out.println("Sum of three integers: " + sum2);

	        double sum3 = example.add(3.5, 2.7);                   // Call the third add method
	        System.out.println("Sum of two doubles: " + sum3);
	    }
	}


