package org.example.foobar;

import java.util.Scanner;

public class FooBarLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (n < 1){
            System.out.println("Число должно быть больше 0");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FooBar");
            } else if (i % 3 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }
    }
}
