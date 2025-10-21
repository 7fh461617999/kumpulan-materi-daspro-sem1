

import java.util.Scanner;

public class testfori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlahh matkul : ");
        int perputaran = sc.nextInt();
        int nilai =0;
        // (1. Inisialisasi) ; (2. Kondisi) ; (3. Iterasi)
        for (int i = 1; i <= perputaran; i++) {
            // 4. Blok Kode
            System.out.println("nilai/gpa matkul ke-" + i +": ");
            int x = sc.nextInt();
            nilai += x ;
            
        }
        System.out.println("============================================================================");
            double nilaiakhir = nilai/perputaran;
            System.out.println("nilai akhir/gpa : "+nilaiakhir);
        
        sc.close();
    }
}
