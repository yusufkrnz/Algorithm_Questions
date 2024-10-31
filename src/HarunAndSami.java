import java.util.Scanner;

public class HarunAndSami {
    public static void main(String[] args) {
/*
        //en çok kim k turda ismi geçtiyse o seçilecek .
        //
        // 5 girildiyse
        // farkın 4 1 olması isteniyor
        // k-1 adet h ya da s yazılması lazım
        // bunun dışında harflerin
        //girilmesi durumu engellenmeli
        //boş olmaması da lazım
        //-------> net değilse Cilek yazdıracağız.
        //

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        String result = "";

        // Kullanıcı k karakter girene kadar devam et

 //HATA 1: GEREKSİZ KOD YAZIMI --(DOĞRUSU)-->String result = input.nextLine();
                                // Tüm satırı bir kerede oku
        while (result.length() < k) {
            // Tek karakter girişi alıyoruz
            String chars = input.next();
            // Alınan inputu biriktiriyoruz, sadece ilk karakteri al
            result += chars.charAt(0);
        }

        //

        int Hskor = 0;
        int Sskor = 0;
        String harun = "H";
        String sami = "S";

        while (!result.isEmpty()) {

            for (int i = 0; i < result.length(); i++) {
            **Hata: result.chars() metodu, String sınıfının
             bir karakter dizisi oluşturmaz;
              bu nedenle karşılaştırma yanlış

                if (result.chars().equals("H")) {
                    Hskor += 1;
                } else {
                    Sskor += 1;
                }
            }
            ** Burada k-1 yerine n-k ile kontrol etmeniz gerekir;
            ** çünkü kalan turlar n - k
            if (Hskor>Sskor+(k-1)){
                System.out.println("Harun");
            } else if (Sskor>Hskor+(k-1)) {
                System.out.println("Sami");
            }else {
                System.out.println("Cilek");
            }

          input.close();
        }
*/ // benim kodum (hataları var)

        // AI  revize sonrası
        // Scanner nesnesi oluşturarak kullanıcıdan girdi almak için
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan toplam tur sayısını (N) ve hatırlanan tur sayısını (K) al
        int n = input.nextInt(); // N: Toplam turlar
        int k = input.nextInt(); // K: Hatırlanan turlar
        input.nextLine(); // Yeni satır karakterini tüketmek için

        // İlk K turun sonuçlarını bir string olarak al
        String result = input.nextLine();

        // Harun ve Sami'nin kazandığı turları saymak için başlangıçta 0 olarak ayarlıyoruz
        int Hskor = 0; // Harun'un skoru
        int Sskor = 0; // Sami'nin skoru

        // İlk K turu kontrol ederek, hangi oyuncunun ne kadar kazandığını say
        for (int i = 0; i < k; i++) {
            // Eğer mevcut karakter 'H' ise, Harun kazanmış demektir
            if (result.charAt(i) == 'H') {
                Hskor++; // Harun'un skorunu artır
            }
            // Eğer mevcut karakter 'S' ise, Sami kazanmış demektir
            else if (result.charAt(i) == 'S') {
                Sskor++; // Sami'nin skorunu artır
            }
        }
        // Harun'un kazanabileceği maksimum skoru hesapla
        int maxH = Hskor + (n - k); // Harun'un mevcut kazanımları + kalan turlar
        // Sami'nin kazanabileceği maksimum skoru hesapla
        int maxS = Sskor + (n - k); // Sami'nin mevcut kazanımları + kalan turlar

        // Kazananı belirlemek için sonuçları karşılaştır
        // Eğer Harun'un skoru, Sami'nin maksimum skordan büyükse, Harun kesin kazandı demektir
        if (Hskor > maxS) {
            System.out.println("Harun");
        }
        // Eğer Sami'nin skoru, Harun'un maksimum skordan büyükse, Sami kesin kazandı demektir
        else if (Sskor > maxH) {
            System.out.println("Sami");
        }
        // Eğer yukarıdaki durumlar sağlanmıyorsa, kesin bir kazanan belirlemek mümkün değildir
        else {
            System.out.println("Cilek");
        }

        // Scanner nesnesini kapat
        input.close();
    }


}
