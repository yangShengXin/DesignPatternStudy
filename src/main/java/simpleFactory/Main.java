package main.java.simpleFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){  //简单工厂模式入口     ，加减乘除运算
        String strResult="";
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数字A");
         String strNumberA= in.next();
         System.out.println("请选择运算符号(+、-、*、/)");
         String strOpreate=in.next();
         System.out.println("请输入数字B");
          String strNumberB=in.next();
          Operation opera=OperationFactory.createOperation(strOpreate);
          opera.setNumberA(Double.parseDouble(strNumberA));
          opera.setNumberB(Double.parseDouble(strNumberB));
           strResult=String.valueOf(opera.GetResult());
          System.out.println("结果是："+strResult);
    }
}
