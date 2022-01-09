import java.util.Scanner;

public class dersOrnekleri_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çizilecek dikdörtgenin enini giriniz...");
        int en = input.nextInt();
        System.out.println("Çizilecek dikdörtgenin boyunu giriniz...");
        int boy = input.nextInt();
        for (int i = 0; i < boy; i++) {
            int k = 0;
            while (k < en) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
}
