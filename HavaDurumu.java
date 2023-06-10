import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını girin: ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else {
            if (sicaklik >= 5 && sicaklik <= 15) {
                System.out.println("Sinema etkinliğini öneririm.");
            } else {
                if (sicaklik > 15 && sicaklik <= 25) {
                    System.out.println("Piknik etkinliğini öneririm.");
                } else {
                    System.out.println("Yüzme etkinliğini öneririm.");
                }
            }
        }
    }
}
