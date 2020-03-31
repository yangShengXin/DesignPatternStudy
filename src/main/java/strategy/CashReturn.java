package main.java.strategy;

/**
 * 返利收费子类
 */
public class CashReturn extends CashSuper {

    private double moneyCondition=0.0d;  //返利阀值
    private double moneyReturn=0.0d;  //返利金额

    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
       this.moneyReturn=Double.parseDouble(moneyReturn);
    }

    @Override
    double acceptCash(double money) {
        int count=(int)((double)money/moneyCondition);
        return money-count*moneyReturn;
    }
}
