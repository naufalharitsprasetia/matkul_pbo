public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas BangunDaerah
        BangunDaerah bangun = new BangunDaerah();

        // Menghitung luas bangun daerah
        bangun.hitungLuas(8,7,7,14,7);

        // Mengambil hasil perhitungan dengan menggunakan getter
        double luasSegitiga = bangun.getLuasSegitiga();
        double luasPersegiPanjangDiarsir = bangun.getLuasPersegiPanjangDiarsir();

        // Total luas bangun daerah yang diarsir
        double totalLuasDiarsir = (2 * luasSegitiga) + luasPersegiPanjangDiarsir;

        // Menampilkan hasil
        System.out.println("Luas bangun daerah yang diarsir: " + totalLuasDiarsir + " cm²");
    }
}