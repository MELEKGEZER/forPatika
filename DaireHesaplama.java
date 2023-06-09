package DaireHesaplama;

import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        double r = scanner.nextDouble();

        double pi = 3.14;
        
        // Alan hesaplama
        double alan = pi * r * r;
        System.out.println("Dairenin Alanı: " + alan);

        // Çevre hesaplama
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire diliminin alanını hesaplama
        System.out.print("Merkez açısının ölçüsünü girin (derece): ");
        double merkezAcisi = scanner.nextDouble();

        double dilimAlan = (pi * r * r * merkezAcisi) / 360;
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }
}

