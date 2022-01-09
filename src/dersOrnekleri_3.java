import java.util.Scanner;

public class dersOrnekleri_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int sayi2 = input.nextInt();
        if (sayi1 == sayi2) {
            System.out.println("sayılar eşit");
        } else if (sayi1 < sayi2) {
            System.out.println("büyük sayı " + sayi2);
        } else {
            System.out.println("büyük sayı " + sayi1);
        }
    }
}
