import java.util.Scanner;

public class dersOrnekleri_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz...");
        int sayi = input.nextInt();
        int teklerToplami = 0, ciftlerToplami = 0, i = 0,kalan, MD;
        while (sayi > 0) {
            kalan = sayi % 10;
            sayi = sayi / 10;
            i++;
            if (kalan % 2 == 0) {
                ciftlerToplami = ciftlerToplami + kalan;
            }
            else {
                teklerToplami = teklerToplami + kalan;
            }
        }
        MD = (teklerToplami - ciftlerToplami) * -1;
        System.out.println("Girilen sayının çift basamaklarının toplamı: " + ciftlerToplami);
        System.out.println("Girilen sayının tek basamaklarının toplamı; " + teklerToplami);
        System.out.println("Girilen sayinin basamak sayisi: " + i);
        System.out.println("Girilen sayinin tek basamaklarının toplamı ve çift basamaklarının toplamının mutlak değeri; " + MD);
    }
}