package main.java.strategy;

//�����շ�����
public class CashNormal extends CashSuper {

    @Override
    double acceptCash(double money) {
        return money;
    }
}
