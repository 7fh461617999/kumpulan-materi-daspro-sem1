
// Mengimpor kelas Scanner dari pustaka Java untuk memungkinkan input dari pengguna.
import java.util.Scanner;

// Mendefinisikan kelas publik bernama ForMultiple09.
public class ForMultiple09 {

    // Metode utama (main method), titik awal eksekusi program.
    public static void main(String[] args) {
    
        // Membuat sebuah objek Scanner baru bernama 'sc' untuk membaca input dari keyboard.
        Scanner sc = new Scanner(System.in);
        
        // Mendeklarasikan tiga variabel integer:
        // 'multiple' untuk menyimpan angka kelipatan yang diinput pengguna.
        // 'sum' untuk mengakumulasi (menjumlahkan) total kelipatan, diinisialisasi dengan 0.
        // 'counter' untuk menghitung banyaknya kelipatan yang ditemukan, diinisialisasi dengan 0.
        int multiple, sum = 0, counter = 0;
        
        // Mencetak pesan ke konsol untuk meminta pengguna memasukkan angka.
        System.out.print("Input the multiple: ");
        // Membaca input integer dari pengguna dan menyimpannya ke dalam variabel 'multiple'.
        multiple = sc.nextInt();

        // Memulai perulangan 'for'. Ini adalah 'definite loop' karena kita tahu pasti akan berjalan 50 kali.
        // 1. Inisialisasi: `int i = 1` -> Memulai variabel penghitung `i` dari 1.
        // 2. Kondisi: `i <= 50` -> Perulangan akan terus berjalan selama nilai `i` kurang dari atau sama dengan 50.
        // 3. Update: `i++` -> Nilai `i` akan bertambah 1 setiap kali satu putaran loop selesai.
        for (int i = 1; i <= 50; i++) {
        
            // Mengecek apakah 'i' adalah kelipatan dari 'multiple'.
            // Operator '%' (modulo) memberikan sisa hasil bagi. Jika sisa hasil baginya 0, berarti 'i' adalah kelipatan.
            if (i % multiple == 0) {
            
                // Jika 'i' adalah kelipatan, tambahkan nilai 'i' ke dalam variabel 'sum'.
                sum = sum + i; // Bisa juga ditulis `sum += i;`
                
                // Jika 'i' adalah kelipatan, tambahkan hitungan pada 'counter' sebanyak 1.
                counter++;
            }
        } // Blok 'for' berakhir di sini, setelah `i` mencapai 50.
        
        // Mencetak hasil akhir menggunakan `printf` (print formatted).
        // `%d` adalah placeholder untuk nilai integer.
        // `\n` adalah karakter untuk membuat baris baru.
        // Menampilkan berapa banyak (`counter`) kelipatan dari `multiple` yang ditemukan.
        System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50 \n", counter, multiple);
        
        // Menampilkan jumlah total (`sum`) dari semua kelipatan `multiple` yang ditemukan.
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d \n", multiple, sum);

        // Menutup objek Scanner untuk melepaskan sumber daya. Ini adalah praktik yang baik.
        sc.close();
    }
}