package org.example.foobar;

import java.util.Scanner;

public class FooBarRecursive {


    static void fooBar(int current, int n) {
        if (n < 1){
            System.out.println("Число должно быть больше 0");
        }

        if (current <= n) {
            if (current % 3 == 0 && current % 5 == 0) {
                System.out.println("FooBar");
            } else if (current % 3 == 0) {
                System.out.println("Foo");
            } else if (current % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(current);
            }
            fooBar(current + 1, n);
        } else {
            return;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        fooBar(1, n);

    }
}
