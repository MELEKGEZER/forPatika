
package SifreKontrol;
import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        String dogruSifre = "123456";
        String kullaniciAdi = "username";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        String girilenSifre = scanner.nextLine();

        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni Şifre: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
    }
}

