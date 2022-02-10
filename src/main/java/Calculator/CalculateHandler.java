package Calculator;

import java.util.*;

public interface CalculateHandler {

    int calculate(Deque<Integer> numCollection, Deque<String> operatorCollection);
    void inputData(Deque<Integer> numCollection, Deque<String> operatorCollection);
}
