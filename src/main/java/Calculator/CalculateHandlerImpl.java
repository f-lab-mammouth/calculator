package Calculator;

import java.util.*;

public class CalculateHandlerImpl implements CalculateHandler {

    @Override
    public int calculate(Deque<Integer> numDeque, Deque<String> operatorDeque) {

        for (String operator : operatorDeque) {
            int leftNum = numDeque.poll();
            int rightNum = numDeque.poll();

            switch (operator) {
                case Operator.PLUS -> numDeque.addFirst(leftNum + rightNum);
                case Operator.MINUS -> numDeque.addFirst(leftNum - rightNum);
                case Operator.MULTIPLY -> numDeque.addFirst(leftNum * rightNum);
                case Operator.DIVIDE -> numDeque.addFirst(leftNum / rightNum);
            }
        }
        return numDeque.poll();
    }

    @Override
    public void inputData(Deque<Integer> numCollection, Deque<String> operatorCollection) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        for (String s : expression.split(" ")) {
            if (isDigit(s)) {
                numCollection.add(Integer.valueOf(s));
            } else {
                operatorCollection.add(s);
            }
        }
    }

    private boolean isDigit(String s) {
        for (Character c : s.toCharArray()) {
            if (!('0' <= c && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
