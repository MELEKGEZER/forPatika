package KDVHesaplama;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Urunun KDV'siz fiyatini girin: ");
        double kdvSizFiyat = scanner.nextDouble();

        double kdvOrani;
        if (kdvSizFiyat > 1000) {
            kdvOrani = 8;
        } else {
            kdvOrani = 18;
        }

        double kdvTutari = (kdvSizFiyat * kdvOrani) / 100;
        double kdvliFiyat = kdvSizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyati: " + kdvSizFiyat);
        System.out.println("KDV Orani: %" + kdvOrani);
        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDV'li Fiyati: " + kdvliFiyat);
    }
}
