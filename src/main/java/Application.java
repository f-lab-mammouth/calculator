import Calculator.*;
import Calculator.CalculateHandlerImpl;

public class Application {

    public static void main(String[] args) {
        CalculateHandler calculateHandler = new CalculateHandlerImpl();
        Calculator calculator = new Calculator(calculateHandler);

        calculator.inputData();
        System.out.println("calculator.calculate() = " + calculator.calculate());
    }
}
