package main.java.strategy;

/**
 * �ֽ��շѹ�����
 */
public class CashContext {  //�򵥹���ģʽ�Ͳ���ģʽ���,   ���ݲ�ͬ������new����ͬ�Ķ���

            CashSuper cs=null;
     public CashContext(String type){
         switch (type){
             case "�����շ�":
                 cs=new CashNormal();
                 break;
             case "��300��100":
                 cs=new CashReturn("300","100");
                 break;
             case "��8��":
                 cs=new CashRebate("0.8");
                 break;
         }
     }

     public double getResult(double money){
        return cs.acceptCash(money);
     }
}
