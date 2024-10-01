import java.util.Scanner;

public class NumToText {

    public static void main(String[] args) {
        // Scanner nesnesi oluşturalım
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Kullanıcıdan en fazla 6 karakter uzunluğunda bir sayı girmesini isteyelim
        while (true) {
            System.out.print("Lütfen 6 karakterden uzun olmayan bir sayı girin: ");
            input = scanner.nextLine();

            // Giriş 6 karakterden uzun değilse çıkış yap
            if (input.length() <= 6 && input.matches("\\d+")) {
                break; // Doğru giriş alındı, döngüden çık
            } else {
                System.out.println("Hatalı giriş, lütfen 6 karakterden uzun olmayan bir sayı girin.");
            }
        }

        // Sayının metin karşılığı için diziler
        String[] birler = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlar = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
        String[] yüzler = {"", "yüz", "iki yüz", "üç yüz", "dört yüz", "beş yüz", "altı yüz", "yedi yüz", "sekiz yüz", "dokuz yüz"};
        String[] binler = {"", "bin", "iki bin", "üç bin", "dört bin", "beş bin", "altı bin", "yedi bin", "sekiz bin", "dokuz bin"};
        String[] onbinler = {"", "on ", "yirmi ", "otuz ", "kırk ", "elli ", "altmış ", "yetmiş ", "seksen ", "doksan "};
        String bin="bin";
        // Sayının her bir basamağını al ve yazıya çevir
        String result = "";

        // Giriş 5 basamaklı veya daha az ise ilgili dizilerden alın
        if (input.length() == 5) {
            if (input.charAt(1)==0) {
                result += onbinler[Character.getNumericValue(input.charAt(0))]; // On binler
                result += bin;
                result += " " + yüzler[Character.getNumericValue(input.charAt(2))]; // Yüzler
                result += " " + onlar[Character.getNumericValue(input.charAt(3))]; // Onlar
                result += " " + birler[Character.getNumericValue(input.charAt(4))]; // Birler
            }else {
                result += onbinler[Character.getNumericValue(input.charAt(0))]; // On binler
                result += " " + birler[Character.getNumericValue(input.charAt(1))]; // Birler
                result += " " + bin;
                result += " " + yüzler[Character.getNumericValue(input.charAt(2))]; // Yüzler
                result += " " + onlar[Character.getNumericValue(input.charAt(3))]; // Onlar
                result += " " + birler[Character.getNumericValue(input.charAt(4))]; // Birler
            }
        } else if (input.length() == 4) {
            result += binler[Character.getNumericValue(input.charAt(0))]; // Binler
            result += " " + yüzler[Character.getNumericValue(input.charAt(1))]; // Yüzler
            result += " " + onlar[Character.getNumericValue(input.charAt(2))]; // Onlar
            result += " " + birler[Character.getNumericValue(input.charAt(3))]; // Birler
        } else if (input.length() == 3) {
            result += yüzler[Character.getNumericValue(input.charAt(0))]; // Yüzler
            result += " " + onlar[Character.getNumericValue(input.charAt(1))]; // Onlar
            result += " " + birler[Character.getNumericValue(input.charAt(2))]; // Birler
        } else if (input.length() == 2) {
            result += onlar[Character.getNumericValue(input.charAt(0))]; // Onlar
            result += " " + birler[Character.getNumericValue(input.charAt(1))]; // Birler
        } else if (input.length() == 1) {
            result += birler[Character.getNumericValue(input.charAt(0))]; // Birler
        }

        // Sonucu ekrana yazdır
        System.out.println("Girdiğiniz sayının yazılışı: " + result.trim());
    }
}

