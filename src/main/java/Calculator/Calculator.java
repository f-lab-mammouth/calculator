package Calculator;

public class Calculator {

    private String expression;
    private CalculateHandler calculateHandler;
    private InputHandler inputHandler;

    public Calculator(CalculateHandler calculateHandler, InputHandler inputHandler) {
        this.calculateHandler = calculateHandler;
        this.inputHandler = inputHandler;
    }

    public int calculate() {
        expression = inputHandler.inputData();
        calculateHandler.splitExpression(expression);
        return calculateHandler.calculate(expression);
    }
}
