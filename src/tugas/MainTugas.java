package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Daftar kategori barang
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Peralatan"
        };

        System.out.println("== Daftar Kategori ==");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat gudang dan menambah data barang
        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Beras", 15000, 20));
        gudang.tambahBarang(new Barang("Gula", 18000, 15));
        gudang.tambahBarang(new Barang("Teh", 12000, 25));
        gudang.tambahBarang(new Barang("Sapu", 35000, 10));
        gudang.tambahBarang(new Barang("Sabun", 5000, 30));

        System.out.println("== Data Barang Awal ==");
        gudang.tampilkanSemua();

        // Menyimpan data ke berkas
        gudang.simpanKeBerkas();

        System.out.println();

        // Membaca kembali data dari berkas
        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println("\n== Data Barang Setelah Dimuat ==");
        gudangBaru.tampilkanSemua();

        // Menampilkan total nilai persediaan
        System.out.println(
                "\nTotal Nilai Persediaan: "
                + gudangBaru.totalNilai()
        );
    }
}