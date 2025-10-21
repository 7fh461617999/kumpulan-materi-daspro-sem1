package function;

public class Kalkulatorluas {
    public static void main(String[] args) {
        // Kita beri bahan baku (10 dan 20)
        int hasil1 = hitungLuasPersegi(10, 20);
        System.out.println("Luas 1: " + hasil1);

        // Kita bisa panggil lagi dengan bahan baku berbeda
        int hasil2 = hitungLuasPersegi(5, 8);
        System.out.println("Luas 2: " + hasil2);
        
        int hasil3 = hitungLuasPersegi(100, 90);
        System.out.println("Luas 3: "+ hasil3);
    }

    // Method ini terima 2 parameter: int 'panjang' dan int 'lebar'
    public static int hitungLuasPersegi(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas; // Kembalikan hasil olahannya
    }
}

