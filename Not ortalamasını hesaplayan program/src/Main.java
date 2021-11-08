import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunu Giriniz : ");
        mat=input.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik=input.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya=input.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce=input.nextInt();
        System.out.print("Tarih Notunu Giriniz : ");
        tarih=input.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik=input.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        boolean durum = sonuc > 60;
        String str = (durum)? " Sınıfı Geçti" : " Sınıfta Kaldı" ;
        System.out.print("Ortalamanız : " + sonuc  );
        System.out.print(str);
    }
}
