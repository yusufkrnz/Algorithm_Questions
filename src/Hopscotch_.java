import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hopscotch_ {


    /**
     * int
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0;
        int k = 0;

        n = input.nextInt();
        k = input.nextInt();

        int[][] dizi = {{0}, {1}, {2, 3}, {4}, {5, 6}, {7}, {8, 9}};


        while (k > 6) {
            k -= 6;
        }

        int[] istenen = dizi[k--];

        /** malum parantezleri kaldırdık output için */

        for (int i = 0; i < istenen.length; i++) {
            System.out.print(istenen[i]);
            if (i < istenen.length - 1) {
                System.out.print(" "); //  ve boşluk
            }
        }
        System.out.println();  // Satır sonu

        //hatalı kullanım soru için
        //System.out.println(Arrays.toString(istenen));

    }


}
