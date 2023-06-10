import java.util.Scanner;

public class TekSayilarinToplami{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Bir sayı girin (Çıkmak için 0 girin): ");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }
        
        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}

