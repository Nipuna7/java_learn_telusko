// Class with private instance variables (Encapsulation)
class Person {
    private String name;  // Private variable (Cannot be accessed directly)
    private int age;

    // Setter methods to modify private variables
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {  // Simple validation
            age = newAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to test encapsulation
public class DemoThree {
    public static void main(String[] args) {
        Person p1 = new Person();
        
        // Setting values using setter methods
        p1.setName("John");
        p1.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}

