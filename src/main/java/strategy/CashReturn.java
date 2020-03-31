package main.java.strategy;

/**
 * �����շ�����
 */
public class CashReturn extends CashSuper {

    private double moneyCondition=0.0d;  //������ֵ
    private double moneyReturn=0.0d;  //�������

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
