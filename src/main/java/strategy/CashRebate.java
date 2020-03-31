package main.java.strategy;

/**
 * �����շ�����
 */
public class CashRebate extends CashSuper {

    private double moneyRebate=1d;

    public CashRebate(String moneyRebate){ //�����շѣ���ʼ��ʱ�����������ۿۣ�����۾���0.8
        this.moneyRebate=Double.parseDouble(moneyRebate);
    }

    @Override
    double acceptCash(double money) {
        return money*moneyRebate;
    }
}
