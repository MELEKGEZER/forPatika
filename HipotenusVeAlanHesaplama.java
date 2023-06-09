
package HipotenusVeAlanHesaplama;

import java.util.Scanner;

public class HipotenusVeAlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dik üçgende hipotenüs hesaplama
        System.out.print("Birinci dik kenarın uzunluğunu girin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci dik kenarın uzunluğunu girin: ");
        double b = scanner.nextDouble();

        double hipotenus = Math.sqrt(a * a + b * b);

        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgenin alanını hesaplama
        System.out.print("Birinci kenarın uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci kenarın uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçüncü kenarın uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}


