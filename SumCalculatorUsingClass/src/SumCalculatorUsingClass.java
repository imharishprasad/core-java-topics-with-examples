
public class SumCalculatorUsingClass {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.getAdditionalResult());
        System.out.println("subtract = "+calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = "+calculator.getMultiplicationResult());
        System.out.println("division = "+calculator.getDivisionResultResult());
    }
}
