public class Calc {
    int number1;
    int number2;

    Calc() {
        System.out.println("Calc");
    }

    Calc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add() {
        return number1 + number2;
    }

    public int sub() {
        return number1 - number2;
    }
}
