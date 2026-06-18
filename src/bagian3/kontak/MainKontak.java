package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");

        // Latihan 3.4 No. 2
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        
        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();

        // Latihan 3.4 No. 1
        System.out.println("\n=== Cari Kontak ===");
        bukuLain.cariKontak("Budi");

        // Latihan 3.4 No. 3
        System.out.println("\n=== Hapus Kontak ===");
        bukuLain.hapusKontak("Budi");

        System.out.println("\n=== Data Setelah Dihapus ===");
        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}