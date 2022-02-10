package Calculator;

import java.util.ArrayDeque;

public class Calculator {

    private CalculateHandler calculateHandler;
    private final ArrayDeque<Integer> numIter = new ArrayDeque<>();
    private final ArrayDeque<String> operatorIter = new ArrayDeque<>();

    public Calculator(CalculateHandler calculateHandler) {
        this.calculateHandler = calculateHandler;
    }

    public int calculate() {
        return calculateHandler.calculate(numIter, operatorIter);
    }

    public void inputData() {
        calculateHandler.inputData(numIter, operatorIter);
    }
}
