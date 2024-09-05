import java.util.Scanner;

public class Usain_Bolt {
    public static void main(String[] args) {
        System.out.println("kaç tane sayı olacak ?");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] seri = new int[a];

        for (int i = 0; i < a; i++) {
            seri[i] = input.nextInt();
        }
        /*
        amaç ilk değeri okuduktan
        sonra ondan büyük
        kaç tane sayı varsa
        -1 adet sonucu yazdıracağız
  */
        //dizinin boyutunu atadım

        int sonuc = 0;

        int referans = seri[0];

        for (int i =1;i<a;i++){
            if (seri[i]> referans){
                sonuc++;
                referans=seri[i];
            }
        }
        System.out.println(sonuc);

    }
}
