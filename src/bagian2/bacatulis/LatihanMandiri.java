package bagian2.bacatulis;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) {

        // Nomor 1
        System.out.println("=== Nomor 1 ===");

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {

            for (String h : hari) {
                penulis.println(h);
            }

        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("Isi hari.txt:");

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // Nomor 2
        System.out.println("\n=== Nomor 2 ===");

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println("Isi hari.txt setelah ditambahkan:");

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // Nomor 3
        System.out.println("\n=== Nomor 3 ===");

        int jumlah = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlah++;
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println("Jumlah baris: " + jumlah);
    }
}