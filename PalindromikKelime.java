import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kelimeyi girin: ");
        String kelime = scanner.nextLine();
        
        if (isPalindrom(kelime)) {
            System.out.println(kelime + " palindromiktir.");
        } else {
            System.out.println(kelime + " palindromik değildir.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrom(String kelime) {
        kelime = kelime.toLowerCase();
        int baslangic = 0;
        int bitis = kelime.length() - 1;
        
        while (baslangic < bitis) {
            if (kelime.charAt(baslangic) != kelime.charAt(bitis)) {
                return false;
            }
            baslangic++;
            bitis--;
        }
        
        return true;
    }
}
