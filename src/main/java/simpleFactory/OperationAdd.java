package main.java.simpleFactory;

public class OperationAdd extends Operation {
    @Override
    public double GetResult() {
        double result=0;
        result=getNumberA()+getNumberB();
        return  result;
    }
}
