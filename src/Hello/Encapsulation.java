package Hello;
class Student {
    // Private instance variables (data) - encapsulated
    private String name;
    private int age;
    private double gpa;
    public Student(String name, int age, double gpa)           // Constructor to initialize the Student object
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }     
    public String getName() {                 // Getter method to access the name
        return name;
    }   
    public void setAge(int age) {              // Setter method to modify the age 
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }    }
 // Getter method to access the age
         public int getAge() {
        return age;
    }
    // Getter method to access the GPA
    public double getGpa() {
        return gpa;
    }
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("GPA: " + gpa);
    }}
public class Encapsulation {
	public static void main(String[] args) {			
        Student student1 = new Student("Amar", 20, 8.0);
        // Access and display information using getter methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student GPA: " + student1.getGpa());    
        
        student1.setAge(23);         // Modify age using setter method    
        student1.displayInfo();      // Display updated information         
	}
}
