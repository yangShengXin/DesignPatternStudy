package main.java.strategy;

public class Main {

    public static void main(String[] args){
      CashContext csuper=new CashContext("��8��");
      double totalPrices=0d;
      totalPrices+= csuper.getResult(1000);
      System.out.println("���ۺ�۸�"+totalPrices);

    }
}
