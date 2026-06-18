package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) {

        // Nomor 1
        System.out.println("=== Nomor 1 ===");
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("Berkas ada.");
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // Nomor 2
        System.out.println("\n=== Nomor 2 ===");
        File arsip = new File("arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // Nomor 3
        System.out.println("\n=== Nomor 3 ===");
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus, ada? "
                    + sementara.exists());

            boolean berhasilHapus = sementara.delete();

            System.out.println("Berhasil dihapus? "
                    + berhasilHapus);

            System.out.println("Sesudah dihapus, ada? "
                    + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: "
                    + e.getMessage());
        }
    }
}