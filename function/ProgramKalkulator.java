package function;

public class ProgramKalkulator {

    public static void main(String[] args) {
        // Kita panggil method 'tambah' dan minta hasilnya.
        // Hasilnya (angka 15) harus kita "tangkap" ke dalam sebuah variabel.

        int hasilPenjumlahan = tambah(); // Memanggil method

        System.out.println("Hasilnya adalah: " + hasilPenjumlahan);

        // Kita bisa gunakan hasilnya lagi
        int hasilDikaliDua = hasilPenjumlahan * 2;
        System.out.println("Jika dikali dua: " + hasilDikaliDua);
    }

    // Tipe kembaliannya 'int', bukan 'void'
    public static int tambah() {
        int a = 5;
        int b = 10;
        int total = a + b;

        // "Pak, ini hasilnya."
        // Wajib ada kata 'return'
        return total;
    }
}