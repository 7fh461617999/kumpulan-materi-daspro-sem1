

import java.util.Scanner;

public class examplecasedowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("== MENU UTAMA ==");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt(); // Misal user input '1'
            if (pilihan == 1) {
                System.out.println("saldo ditampilkan");
            } else if (pilihan == 2) {
                System.out.println("berhasil tarik tunai");
            } else if (pilihan == 0) {

            } else {
                System.out.println("Invalid Input ");
            }
            // (Lakukan sesuatu berdasarkan pilihan... kode di-skip)

        } while (pilihan != 0); // Cek kondisi: Apakah 1 != 0? Ya. Ulangi loop.
                                // Jika user input '0', kondisi 0 != 0 adalah Salah. Loop berhenti.

        System.out.println("Terima kasih telah menggunakan layanan kami.");
        input.close();
    }
}
