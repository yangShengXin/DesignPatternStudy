package main.java.simpleFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){  //�򵥹���ģʽ���     ���Ӽ��˳�����
        String strResult="";
        Scanner in=new Scanner(System.in);
        System.out.println("����������A");
         String strNumberA= in.next();
         System.out.println("��ѡ���������(+��-��*��/)");
         String strOpreate=in.next();
         System.out.println("����������B");
          String strNumberB=in.next();
          Operation opera=OperationFactory.createOperation(strOpreate);
          opera.setNumberA(Double.parseDouble(strNumberA));
          opera.setNumberB(Double.parseDouble(strNumberB));
           strResult=String.valueOf(opera.GetResult());
          System.out.println("����ǣ�"+strResult);
    }
}
