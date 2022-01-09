import java.util.Scanner;

public class dersOrnekleri_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz...");
        int sayi = input.nextInt();
        int i, carpım = 1, toplam = 0;
        double sonuc=0;
        if (sayi % 2 == 0) {
            for (i = 1; sayi > 0; i++) {
                int kalan = sayi % 10;
                sayi = sayi / 10;
                toplam = toplam + kalan;
                sonuc = toplam / i;
            }
            System.out.println("Girdiğiniz sayının aritmetik ortalaması: "+ sonuc);
        } else {
            i = 1;
            while (sayi > 0) {
                int kalan = sayi % 10;
                sayi = sayi / 10;
                carpım = carpım * kalan;
                sonuc = carpım ^ 1 / i;
                i++;
            }System.out.println("Girdiğiniz sayının Geometrik Ortalaması: "+sonuc );
        }
    }
}
