import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();
        
        // Faktöriyel hesaplama metodu
        long faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        
        // Kombinasyon hesaplama
        long kombinasyon = faktoriyel / (faktoriyel(r) * faktoriyel(n - r));
        
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
    
    // Faktöriyel hesaplama metodu
    public static long faktoriyel(int number) {
        long faktoriyel = 1;
        for (int i = 1; i <= number; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}

