import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int tahminLimiti = 5;
        int minSayi = 0;
        int maxSayi = 100;
        int rastgeleSayi = random.nextInt(maxSayi - minSayi + 1) + minSayi;
        int tahmin;
        boolean tahminEdildi = false;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin et.");
        System.out.println("Tahmin hakkın: " + tahminLimiti);

        while (tahminLimiti > 0 && !tahminEdildi) {
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();

            if (tahmin == rastgeleSayi) {
                tahminEdildi = true;
                System.out.println("Tebrikler! Doğru tahmin ettin. Sayı: " + rastgeleSayi);
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı dene.");
            } else {
                System.out.println("Daha küçük bir sayı dene.");
            }

            tahminLimiti--;
            System.out.println("Kalan tahmin hakkın: " + tahminLimiti);
        }

        if (!tahminEdildi) {
            System.out.println("Tahmin hakkın bitti. Doğru sayı: " + rastgeleSayi);
        }

        scanner.close();
    }
}
