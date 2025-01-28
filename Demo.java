public class Demo {
    String name;
    // non parameterized constructor
    Demo() {
        System.out.println("Nipuna");
    }

    // Parameterized constructor
    Demo(String name) {
        this.name = name;
        System.out.println(name);
    }
}
