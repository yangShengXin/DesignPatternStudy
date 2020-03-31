package main.java.strategy;

/**
 * 现金收费抽象类
 */
public abstract class CashSuper {
   //现金收费类的抽象方法，收取现金，参数为原价，返回为当前价
    abstract double acceptCash(double money);
}
