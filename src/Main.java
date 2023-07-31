import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] karakterData = { // Array 2D untuk menyimpan data yang berisi nama karakter dan deskripsinya.
                { "Knight",
                        "Knight adalah pejuang yang ulung dengan kemampuan bertahan yang hebat. "
                                + "Dia membawa perisai besar dan pedang berat untuk melindungi diri dan rekan-rekannya dalam pertempuran." },
                { "Mage",
                        "Mage adalah penyihir kuat dengan kemampuan sihir yang luar biasa. "
                                + "Dia dapat melempar mantra untuk menghancurkan musuhnya dari jarak jauh. "
                                + "Meskipun dia lemah dalam pertempuran fisik, kekuatannya dalam sihir menjadikannya pilihan yang bijaksana dalam tim." },
                { "Archer",
                        "Archer adalah penembak jitu yang sangat terampil. Dia menggunakan busur panjang "
                                + "untuk menyerang musuh dari jarak jauh dengan tepat. Kecepatan dan ketepatan adalah kekuatannya dalam pertempuran." },
                { "Berserker",
                        "Berserker adalah pejuang berani yang mengandalkan kekuatan dan kemarahan dalam pertempuran. "
                                + "Dia bergerak cepat dan menyerang musuhnya dengan kemarahan yang tak terbendung. "
                                + "Meskipun dia kuat dalam serangan, kekurangan pertahanan membuatnya harus berhati-hati dalam pertempuran." }
        };
        int jumlahKarakter = karakterData.length; // Menghitung jumlah karakter yang tersedia dalam permainan.

        // Menampilkan tampilan awal
        System.out.println("Selamat datang di Pemilihan Karakter Fantasy!");
        System.out.println("Berikut adalah pilihan karakter yang tersedia:");
        System.out.println(); // Menampilkan baris kosong untuk space
        for (int indexKarakterData = 0; indexKarakterData < jumlahKarakter; indexKarakterData++) { // Melakukan perulangan untuk menampilkan setiap karakter beserta nomor urutannya.
            System.out.println((indexKarakterData + 1) + ". " + karakterData[indexKarakterData][0]); // Menampilkan nomor urutan karakter dan nama karakter.
        }
        System.out.println(); // Menampilkan baris kosong untuk space
        System.out.print("Masukkan nomor karakter yang Anda pilih(1-" + jumlahKarakter + "): ");// Meminta pengguna untuk memasukkan nomor karakter yang dipilih.

        while (!scanner.hasNextInt()){// Validasi apakah input pengguna adalah angka.
            System.out.println("Maaf, input tidak sesuai"); // Menampilkan pesan kesalahan user
            scanner.next(); // Membersihkan input user
            System.out.print("Masukkan nomor karakter yang Anda pilih(1-" + jumlahKarakter + "): ");
        }

        int pilihKarakter = scanner.nextInt(); // Membaca input nomor karakter yang dipilih oleh pengguna.
        while (pilihKarakter < 1|| pilihKarakter > 4){ // Validasi apakah input pengguna sesuai dengan pilihan karakter yang tersedia (1 sampai jumlahKarakter).
            System.out.println("Maaf, batas yang dapat dipilih dari 1 sampai " + jumlahKarakter); // Menampilkan pesan kesalahan jika input di luar batas pilihan karakter.
            System.out.print("Masukkan nomor karakter yang Anda pilih(1- " + jumlahKarakter + "): ");// Meminta pengguna untuk memasukkan kembali nomor karakter yang dipilih.
            pilihKarakter = scanner.nextInt(); // Membaca kembali input nomor karakter.
        }

        System.out.println("\n\n");
        System.out.println("Anda memilih karakter " + karakterData[pilihKarakter - 1][0] + "."); // Menampilkan pesan bahwa pengguna telah memilih karakter tertentu.
        System.out.println(karakterData[pilihKarakter - 1][1]); // Menampilkan deskripsi karakter yang dipilih oleh pengguna.
        System.out.println(); // Menampilkan baris kosong untuk memberi jarak antara pesan dan akhir program.
        System.out.println("Selamat bermain permainan fantasy dengan karakter Mage Anda!");
        scanner.close(); // Menutup scanner
    }
}