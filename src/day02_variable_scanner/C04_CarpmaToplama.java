package day02_variable_scanner;

import java.util.Scanner;

public class C04_CarpmaToplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ondalıklı sayı giriniz.");
        double ondalikliSayi = scan.nextDouble();
        System.out.println("Tamsayı giribiz.");
        int tamSayi = scan.nextInt();

        System.out.println("Sayıların toplamı"+ (ondalikliSayi+tamSayi));
        System.out.println("Sayıların çarpımı"+ (ondalikliSayi*tamSayi));
    }
}
