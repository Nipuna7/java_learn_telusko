public class AddCalc extends Calc {
    AddCalc() {
        System.out.println("Calc Feature Update");
    }

    AddCalc(int number1,int number2) {
        super(number1,number2);
    }

    public int divide() {
        int result = 0;

        try {
            result = number1 / number2;
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

    public int multi() {
        return number1 * number2;
    }
}
