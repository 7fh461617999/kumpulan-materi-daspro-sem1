package looping.latihan;

import java.util.Scanner;

public class testnestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input loop :");
        int loop = sc.nextInt();
        // Loop Luar (mengatur Baris, ke bawah)
        for (int i = 1; i <= loop; i++) {

            // Loop Dalam (mengatur Kolom, ke samping)
            for (int j = 1; j <= loop; j++) {
                System.out.print("*  "); // print() (tanpa 'ln') agar menyamping
            }
            // Pindah baris setelah 1 baris kolom selesai
            System.out.println();
        }
        sc.close();
    }
}
