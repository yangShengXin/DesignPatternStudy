package main.java.strategy;

public class Main {

    public static void main(String[] args){
      CashContext csuper=new CashContext("打8折");
      double totalPrices=0d;
      totalPrices+= csuper.getResult(1000);
      System.out.println("打折后价格："+totalPrices);

    }
}
