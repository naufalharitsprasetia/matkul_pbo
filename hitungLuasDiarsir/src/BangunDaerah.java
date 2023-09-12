class BangunDaerah {
    private double luasSegitiga;
    private double luasPersegiPanjangDiarsir;

    public void hitungLuas(int alas, int tinggi, int jari2, int panjang, int lebar) {
        // Menghitung luas dua segitiga siku-siku
        double luasSegitiga = 0.5 * (alas * tinggi);

        // Menghitung luas setengah lingkaran
        double luasLingkaran = Math.PI * jari2 * jari2;
        double luasSetengahLingkaran = 0.5 * luasLingkaran;

        // Menghitung luas persegi panjang yang diarsir
        double luasPersegiPanjangDiarsir = (panjang * lebar) - luasSetengahLingkaran;

        // Menyimpan hasil perhitungan dalam atribut objek
        this.luasSegitiga = luasSegitiga;
        this.luasPersegiPanjangDiarsir = luasPersegiPanjangDiarsir;
    }
    public double getLuasSegitiga() {
        return luasSegitiga;
    }
    public double getLuasPersegiPanjangDiarsir() {
        return luasPersegiPanjangDiarsir;
    }
}
