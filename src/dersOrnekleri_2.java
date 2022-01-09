import java.util.Scanner;
public class dersOrnekleri_2 {
    public static void main (String [] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Sicil No Giriniz:");
    String Sicil_No= input.nextLine();
    System.out.println("Çalışma Saatinizi Giriniz:");
    int Calisma_Saati= input.nextInt();
    System.out.println("Saatlik ücretinizi giriniz:");
    double Saatlik_Ucret=input.nextDouble();
    double maas=(Calisma_Saati*Saatlik_Ucret);
    double prim=(maas*0.14);
    double Gelir_Vergisi= (maas*0.15);
    double Net_Maas= (maas-(Gelir_Vergisi+prim));
    System.out.println (Sicil_No+" Sicil nolu çalışanın net maaşı: "+Net_Maas);
    System.out.println(Sicil_No+ " Sicil Nolu çalışanının primi:"+prim+ " ve gelir vergisi: "+Gelir_Vergisi);
    }
}
