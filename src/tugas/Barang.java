package tugas;

public class Barang {

    // Data barang
    private String nama;
    private double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah data menjadi satu baris teks
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Menampilkan informasi barang
    public String info() {
        return nama + " - Harga: " + harga + " - Stok: " + stok;
    }
}