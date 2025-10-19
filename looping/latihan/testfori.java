package looping.latihan;

import java.util.Scanner;

public class testfori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan perputaran");
        int perputaran = sc.nextInt();
        // (1. Inisialisasi) ; (2. Kondisi) ; (3. Iterasi)
        for (int i = 1; i <= perputaran; i++) {
            // 4. Blok Kode
            System.out.println("Hello, putaran ke-" + i);
        }
        sc.close();
    }
}
