package day39_manavProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BUrunSecme extends AManavListesi {
static Scanner scan= new Scanner(System.in);
static List<String> urunler=new ArrayList<>();
static   List<String> yeniUrun = new ArrayList<>();
static  AManavListesi urun=new AManavListesi();
static   List<Double> ekstre = new ArrayList<>();
static  List<Double>ekstre1=new ArrayList<>();
static int kg;
static String urunNo;

    public static void main(String[] args) {

        girisPaneli();
        System.out.println(urun.ManavList);
        urunler.add("00        Domates       20.10 TL");
        urunler.add("01        Patates       30.20 TL");
        urunler.add("02        Biber         30.50 TL");
        urunler.add("03        Soğan         20.30 TL");
        urunler.add("04        Havuç         30.10 TL");
        urunler.add("05        Elma          50.20 TL");
        urunler.add("06        Muz           100.90 TL");
        urunler.add("07        Çilek         60.10 TL");
        urunler.add("08        Kavun         40.30 TL");
        urunler.add("09        Üzüm          20.70 TL");
        urunler.add("10        Limon         10.50 TL");
        urunSec(urunler);

       urunDevamMi();

       odeme();

       toplam();



    }

    private static void toplam() {
        double toplam=0;
        String yeniUrun1="";
        for (int i = 0; i <ekstre1.size() ; i++) {
            toplam+=ekstre1.get(i);
        }
        for (int i = 0; i < yeniUrun.size() ; i++) {
            yeniUrun1+=yeniUrun.get(i).substring(10)+"\n";
        }

        System.out.println("Aldiginiz urunler : \n"+yeniUrun1+"\nAldiginiz urunlerin toplam fiyati : "+toplam);  //listedeki urunlerin toplam fiyati
    }

    private static void odeme() {
         ekstre1.add(Double.parseDouble(yeniUrun.get(0).substring(2).replaceAll("\\D",""))*kg/100);
        for (int i = 1; i < yeniUrun.size() ; i++) {
            ekstre.add(Double.parseDouble(yeniUrun.get(i).substring(2).replaceAll("\\D",""))*kg/100);
        }

        for (int i = 0; i < ekstre.size() ; i++) {
            ekstre1.add(ekstre.get(i));
        }
        System.out.println(ekstre1);

    }

    private static void girisPaneli() {
        System.out.println("\t*******Hosgeldiniz********\n");

    }

    private static boolean urunDevamMi() {
        boolean devamMi;
        System.out.println("urun eklemek istiyormusun istiyorsaniz true istemiyorsaniz false tusuna basin");
        devamMi = scan.nextBoolean();

        while (!devamMi == false) {
            System.out.println(urun.ManavList);
            urunSec(urunler);
            System.out.println("urun eklemek istiyormusun istiyorsaniz true istemiyorsaniz false tusuna basin");
            devamMi = scan.nextBoolean();
            System.out.println(yeniUrun);

        }
        return devamMi;
    }

    private static void urunSec(List<String> urunler) {

        System.out.println("urun nosunu girin");
        urunNo= scan.next();
        System.out.println("kac kg almak istiyorsunuz");
         kg = scan.nextInt();
      if(Integer.parseInt(urunNo)>=0&&Integer.parseInt(urunNo)<11){
        for (int i = 0; i < urunler.size() ; i++) {
            if(urunler.get(i).substring(0,2).contains(urunNo))
            yeniUrun.add(urunler.get(i));

        }
    }else {
    System.out.println("gecerli urun no girin");
}
        System.out.println(yeniUrun);


    }






}
