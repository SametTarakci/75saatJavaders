package day02_variable_scanner;

import java.util.Scanner;

public class C05_İsimKayit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz.");
        String girilenİsim = scanner.nextLine();
        System.out.println("Soyadinizi giriniz.");
        String girilenSoyisim = scanner.nextLine();
        System.out.println("Yasinizi giriniz.");
        int girilenYas = scanner.nextInt();
        System.out.println("Kaydiniz basariyla yapilmiştir.");
        System.out.println("kaydınız:"+ "\n"+ (girilenİsim + "\n" + girilenSoyisim +"\n"+ girilenYas));
    }
}