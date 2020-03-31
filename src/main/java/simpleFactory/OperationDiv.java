package main.java.simpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        // if (getNumberB() == 0)

        result = getNumberA() / getNumberB();
        return result;
    }
}
