package TugasPraktikum1;

import java.util.HashMap;
import java.util.Map;

public class Calculation {

    private double operan1;
    private char operation;
    private double operan2;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculation(double operan1, double operan2, char operation) {
        this.operan1 = operan1;
        this.operan2 = operan2;
        this.operation = operation;

        operationMap.put('+', (Operation) new Addition());
        operationMap.put('-', (Operation) new Subtraction());
        operationMap.put('/', (Operation) new Devided());
        operationMap.put('*', (Operation) new Multiple());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
            // System.out.println(operationMap.get(operation));
        } else {
            System.out.println("invalid sign");
        }
        return operationMapValue.calculateResult(operan1, operan2);
    }
}
