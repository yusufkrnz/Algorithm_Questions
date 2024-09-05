import java.util.Scanner;

public class Stringer_Things {
    public static void main(String[] args) {
/*
        // İlk satırdaki N tam sayısını oku ama kullanma
        int N = input.nextInt();
        // hata nerede diye 20 dk gitti fark edene kadar
        input.nextLine(); // Satırı geçmek için ekledik
        */


        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        char[] seri = a.toCharArray();
        String output = "";

        for (int i = 0; i < seri.length; i++) {
            // Eğer dizinin ilk elemanıysa veya bir önceki karakterden farklıysa
            if (i == 0 || seri[i] != seri[i - 1]) {
                output += seri[i];
            }
        }

        // Çıktıyı yazdır
        System.out.println(output);
    }
}
