import java.util.Scanner;

public class dersOrnekleri_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Öğretmen maaşını giriniz");
            int ogretmen_Maası = input.nextInt();
            T = T + ogretmen_Maası;
        }
        System.out.println("Maaş Toplamı: " + T);
    }
}