import java.util.Scanner;
public class HarunAndSami {
    public static void main(String[] args) {

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
                if (result.chars().equals("H")) {
                    Hskor += 1;
                } else {
                    Sskor += 1;
                }
            }
            if (Hskor>Sskor+(k-1)){
                System.out.println("Harun");
            } else if (Sskor>Hskor+(k-1)) {
                System.out.println("Sami");
            }else {
                System.out.println("Cilek");
            }

          input.close();
        }

    }


}
