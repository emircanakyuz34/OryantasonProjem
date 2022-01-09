import java.util.Scanner;

public class dersOrnekleri_14 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Başlangıç ifadesini giriniz");
        int baslangıc=input.nextInt();
        System.out.println("Artış Miktarını giriniz...");
        int artıs=input.nextInt();
        System.out.println("Adet miktarını giriniz...");
        int adet=input.nextInt();
        while (adet>0){
            System.out.println(baslangıc);
            baslangıc=baslangıc+artıs;
            adet=adet-1;
        }System.out.println("Döngü bitti.");
    }
}
