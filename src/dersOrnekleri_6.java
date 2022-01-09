import java.util.Scanner;

public class dersOrnekleri_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz.");
        String cinsiyet = input.nextLine();
        System.out.println("Lütfen adım sayınızı giriniz.");
        int adimSayisi = input.nextInt();
    double kalori;
    if (cinsiyet.equals("kadin")){
        kalori=adimSayisi*30/500;
        }else{
        kalori=adimSayisi*45/500;
        }
    System.out.println("yakılan kalori miktarı: "+kalori);
    }
}