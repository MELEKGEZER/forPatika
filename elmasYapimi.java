import java.util.Scanner;

public class elmasYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;

        // Üst kısım
        for (int i = 0; i < yukseklik; i++) {
            // Boşlukları yazdırma
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi--;
            yildizSayisi += 2;
        }

        boslukSayisi = 1;
        yildizSayisi = yukseklik * 2 - 3;

        // Alt kısım
        for (int i = 0; i < yukseklik - 1; i++) {
            // Boşlukları yazdırma
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
