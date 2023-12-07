
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        MathOperation sum = (x, y) -> x + y;
        MathOperation sub = (x, y) -> x - y;
        MathOperation tim = (x, y) -> x * y;
        MathOperation div = (x, y) -> x / y;

        System.out.println(calculator.executeOperation(2, 3, sum));
        System.out.println(calculator.executeOperation(2, 3, sub));
        System.out.println(calculator.executeOperation(2, 3, tim));
        System.out.println(calculator.executeOperation(2, 3, div));


    }
}
