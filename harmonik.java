import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        double harmonikSerisi = 0;
        
        for (int i = 1; i <= sayi; i++) {
            harmonikSerisi += 1.0 / i;
        }
        
        System.out.println("Harmonik Serisi: " + harmonikSerisi);
    }
}

