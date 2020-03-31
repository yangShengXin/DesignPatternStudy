package main.java.strategy;

//正常收费子类
public class CashNormal extends CashSuper {

    @Override
    double acceptCash(double money) {
        return money;
    }
}
