package main.java.strategy;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate=1d;

    public CashRebate(String moneyRebate){ //打折收费，初始化时，必需输入折扣，如八折就是0.8
        this.moneyRebate=Double.parseDouble(moneyRebate);
    }

    @Override
    double acceptCash(double money) {
        return money*moneyRebate;
    }
}
