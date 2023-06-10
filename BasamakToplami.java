import java.util.Scanner;

public class BasamakToplami{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        int temp = sayi;
        
        while (temp != 0) {
            int basamak = temp % 10;
            toplam += basamak;
            temp /= 10;
        }
        
        System.out.println("Basamakların toplamı: " + toplam);
    }
}

