import java.util.Scanner;

public class JavaPatika {
    static void plus() {
        // Toplama işlemi metodu
        // ...
    }

    static void minus() {
        // Çıkarma işlemi metodu
        // ...
    }

    static void times() {
        // Çarpma işlemi metodu
        // ...
    }

    static void divided() {
        // Bölme işlemi metodu
        // ...
    }

    static void power() {
        // Üslü sayı hesaplama metodu
        // ...
    }

    static void factorial() {
        // Faktoriyel hesaplama metodu
        // ...
    }

    static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz: ");
        int dividend = scan.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int divisor = scan.nextInt();
        int result = dividend % divisor;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        double length = scan.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        double width = scan.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Dikdörtgenin Alanı: " + area);
        System.out.println("Dikdörtgenin Çevresi: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
