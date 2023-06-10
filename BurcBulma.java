import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum günü gününü girin: ");
        int gun = scanner.nextInt();

        System.out.print("Doğum ayını girin: ");
        int ay = scanner.nextInt();

        String burc = "";

        switch (ay) {
            case 1: // Ocak
                if (gun >= 1 && gun <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
                break;
            case 2: // Şubat
                if (gun >= 1 && gun <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
                break;
            case 3: // Mart
                if (gun >= 1 && gun <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
                break;
            case 4: // Nisan
                if (gun >= 1 && gun <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
                break;
            case 5: // Mayıs
                if (gun >= 1 && gun <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
                break;
            case 6: // Haziran
                if (gun >= 1 && gun <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
                break;
            case 7: // Temmuz
                if (gun >= 1 && gun <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
                break;
            case 8: // Ağustos
                if (gun >= 1 && gun <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
                break;
            case 9: // Eylül
                if (gun >= 1 && gun <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
                break;
            case 10: // Ekim
                if (gun >= 1 && gun <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
                break;
            case 11: // Kasım
                if (gun >= 1 && gun <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
                break;
            case 12: // Aralık
                if (gun >= 1 && gun <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
                break;
            default:
                System.out.println("Geçersiz ay girişi.");
                return;
        }

        System.out.println("Burcunuz: " + burc);
    }
}

