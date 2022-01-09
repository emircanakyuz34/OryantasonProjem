import java.util.Scanner;

public class dersOrnekleri_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen final notunuzu giriniz...");
        int finalNotu = input.nextInt();
        System.out.println("Lütfen vize notunuzu giriniz...");
        int vizeNotu = input.nextInt();
        double sonuc = finalNotu * 0.6 + vizeNotu * 0.4;
        if (sonuc >= 50) {
            System.out.println("Tebrikler.. Geçtiniz.");
        } else {
            System.out.println("Kaldın beyinsiz aferin.");
        }
    }
}
