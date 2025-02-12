package day02_variable_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adinizi giriniz...");

        // String girilenİsim = scanner.next(); // Kullanıcının girdiği metnin ilk boşluğa kadar olan kısmını alır.

        String girilenİsim = scanner.nextLine(); // Kullanıcının girdiği metnin bilginin tamamını alır.

        System.out.println("Girilen ismin büyük harfle yazilmis hali:" + girilenİsim.toUpperCase());

    }
}
