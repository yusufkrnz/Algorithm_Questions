import java.util.Scanner;
import java.util.Arrays;

public class Yum_Yum_Sorusu {

    public static void main(String[] args) {
        /**
         *
         *
         * String in içini satır satır gezip
         * charların eşşiz olanını
         * almam lazım  ve
         * yeni Stringe yazdırmam lazım
         *
         * */
        Scanner giris = new Scanner(System.in);
        // int değeri yazdırdım
        int n = giris.nextInt();
        // int array oluşturdum
        // ve boyutunu tanımladım

        int answer = 0;
        /** boyutu a kadar olan bi n dizisi tanımladım */

        int[] a = new int[n];


        for (int i = 0; i < a.length; i++) {
            //kullanıcıdan aldığım elemanları dizye atıyorum
            a[i] = giris.nextInt();
        }
        Arrays.sort(a);
          /** EN BÜYÜK N-1 ELEMANI TOPLUYORUZ*/
        for (int i = n - 1; i >= 1; i--) {

            answer += a[i];
        }
        System.out.println(answer);
        giris.close();

    }


}


