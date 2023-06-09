
package forpatika;

import java.util.Scanner;

public class NotOrt {

    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int mat,fiz,kim,tur,tar,muz;
     
     System.out.print("Matematik notunu girin: ");
     mat=input.nextInt();
    
     
     System.out.print("Fizik notunu girin: ");
     fiz=input.nextInt();
     
     
     System.out.print("Kimya notunu girin: ");
     kim=input.nextInt();
  
     
     System.out.print("Turkce notunu girin: ");
     tur=input.nextInt();
     
     
     System.out.print("Tarih notunu girin: ");
     tar=input.nextInt();
    
     
     System.out.print("Muzik notunu girin: ");
     muz=input.nextInt();
     System.out.print("Alinan notlar =>");
     System.out.println(" matematik: "+mat+" fizik: "+ fiz+" kimya: "+ kim+" turkce: "+ tur+" tarih: "+ tar+" muzik: "+ muz);
     
     double ort = (mat+fiz+kim+tur+tar+muz)/6.0;
     System.out.println("Ortalama: " + ort);
     
   
     String sinifDurumu = (ort > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sinifDurumu);
     
    }
    
}
