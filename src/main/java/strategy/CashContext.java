package main.java.strategy;

/**
 * 现金收费工厂类
 */
public class CashContext {  //简单工厂模式和策略模式结合,   根据不同的类型new出不同的对象

            CashSuper cs=null;
     public CashContext(String type){
         switch (type){
             case "正常收费":
                 cs=new CashNormal();
                 break;
             case "满300返100":
                 cs=new CashReturn("300","100");
                 break;
             case "打8折":
                 cs=new CashRebate("0.8");
                 break;
         }
     }

     public double getResult(double money){
        return cs.acceptCash(money);
     }
}
