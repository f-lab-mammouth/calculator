import Calculator.*;
import Calculator.CalculateHandlerImpl;

public class Application {

    public static void main(String[] args) {
        CalculateHandler calculateHandler = new CalculateHandlerImpl();
        InputHandler inputHandler = new InputHandlerImpl();
        Calculator calculator = new Calculator(calculateHandler, inputHandler);

        System.out.println("calculator.calculate() = " + calculator.calculate());
    }
}
