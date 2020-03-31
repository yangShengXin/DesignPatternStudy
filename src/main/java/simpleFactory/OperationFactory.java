package main.java.simpleFactory;

public class OperationFactory {

    public static Operation createOperation(String operate){   //�����㹤����
        Operation opera=null;
      switch (operate){
          case "+":
              opera=new OperationAdd();
              break;
          case "-":
              opera=new OperationSub();
              break;
          case "*":
              opera=new OperationMul();
              break;
          case "/":
              opera=new OperationDiv();
              break;
      }
      return opera;
    }
}
