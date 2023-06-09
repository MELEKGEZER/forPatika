
package TaksimetreProgrami;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM) girin: ");
        double mesafe = scanner.nextDouble();

        double acilisUcreti = 10.0;
        double kmBasinaUcret = 2.20;

        double toplamTutar = acilisUcreti + (mesafe * kmBasinaUcret);
        double minimumTutar = 20.0;

        if (toplamTutar < minimumTutar) {
            toplamTutar = minimumTutar;
        }

        System.out.println("Taksimetre Tutari: " + toplamTutar + " TL");
    }
}

