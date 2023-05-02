package com.itheima.test;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        boolean flag = true;
        int Original = 0;
        double BeforeTax = 0.0;
        double Result = 0.0;

        while (flag) {
            System.out.println("请输入税前工资：");
            Scanner sc = new Scanner(System.in);
            Original = sc.nextInt();
            if (Original < 0) System.out.println("请输入正确数据！");
            else flag = false;
        }

        BeforeTax = Original * 0.9;
        if ((BeforeTax) <= 5000) Result = BeforeTax;
        else {
            double TaxPart = BeforeTax - 5000;
            if (TaxPart <= 3000)
                Result = 5000 + TaxPart * 0.97;
            else if (TaxPart <= 12000)
                Result = 5000 + 3000 * 0.97 + (TaxPart - 3000) * 0.9;
            else if (TaxPart <= 25000)
                Result = 5000 + 3000 * 0.97 + 9000 * 0.9 + (TaxPart - 12000) * 0.8;
            else if (TaxPart <= 35000)
                Result = 5000 + 3000 * 0.97 + 9000 * 0.9 + 13000 * 0.8 + (TaxPart - 25000) * 0.75;
            else if (TaxPart <= 55000)
                Result = 5000 + 3000 * 0.97 + 9000 * 0.9 + 13000 * 0.8 + 10000 * 0.75 + (TaxPart - 35000) * 0.7;
            else if (TaxPart <= 80000)
                Result = 5000 + 3000 * 0.97 + 9000 * 0.9 + 13000 * 0.8 + 10000 * 0.75 + 15000 * 0.7 + (TaxPart - 55000) * 0.65;
            else
                Result = 5000 + 3000 * 0.97 + 9000 * 0.9 + 13000 * 0.8 + 10000 * 0.75 + 15000 * 0.7 + 25000 * 0.65 + (TaxPart - 80000) * 0.55;
        }
        System.out.println("税后收入为" + Result);
    }
}
