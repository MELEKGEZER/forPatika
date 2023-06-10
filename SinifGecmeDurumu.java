
package SinifGecmeDurumu;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        int matematikNotu = scanner.nextInt();

        System.out.print("Fizik notunu girin: ");
        int fizikNotu = scanner.nextInt();

        System.out.print("Türkçe notunu girin: ");
        int turkceNotu = scanner.nextInt();

        System.out.print("Kimya notunu girin: ");
        int kimyaNotu = scanner.nextInt();

        System.out.print("Müzik notunu girin: ");
        int muzikNotu = scanner.nextInt();

        int toplamDers = 0;
        int toplamNot = 0;

        if (matematikNotu >= 0 && matematikNotu <= 100) {
            toplamNot += matematikNotu;
            toplamDers++;
        }

        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplamNot += fizikNotu;
            toplamDers++;
        }

        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplamNot += turkceNotu;
            toplamDers++;
        }

        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplamNot += kimyaNotu;
            toplamDers++;
        }

        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplamNot += muzikNotu;
            toplamDers++;
        }

        if (toplamDers > 0) {
            double ortalama = (double) toplamNot / toplamDers;
            System.out.println("Ortalama: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        } else {
            System.out.println("Girilen notlara göre hesaplama yapılamadı.");
        }
    }
}



