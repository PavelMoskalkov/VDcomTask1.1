package org.example.foobar;

import java.util.Scanner;

public class FooBarTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        if (n < 1){
            System.out.println("Число должно быть больше 0");
        }

        for (int i = 1; i <= n; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FooBar" :
                            (i % 3 == 0) ? "Foo" :
                            (i % 5 == 0) ? "Bar" :
                            String.valueOf(i);
            System.out.println(result);
        }

    }
}
