public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        AddCalc addCalc = new AddCalc(20,5);

        System.out.println(addCalc.add());
        System.out.println(addCalc.sub());
        System.out.println(addCalc.divide());
        System.out.println(addCalc.multi());
    }
}