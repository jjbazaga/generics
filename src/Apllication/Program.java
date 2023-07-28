package Apllication;

import entities.PrintService;
import entities.PrintServiceInteger;
import entities.PrintServiceType;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintServiceType<String> ps = new PrintServiceType<>();


        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
