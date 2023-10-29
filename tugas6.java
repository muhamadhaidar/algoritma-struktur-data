package arraylist;
    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buku {
    String judul;
    String pengarang;
    int kategori;

    public Buku(String judul, String pengarang, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.kategori = kategori;
    }
}

public class tugas6 {
    public static void main(String[] args) {
        List<Buku> daftarBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Perpustakaan Online");
            System.out.println("Pilih operasi yang ingin Anda lakukan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Keluar");

            int pilihan = input.nextInt();
            input.nextLine();  // Membersihkan karakter newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan judul buku:");
                    String judul = input.nextLine();
                    System.out.println("Masukkan pengarang buku:");
                    String pengarang = input.nextLine();
                    System.out.println("Pilih kategori buku (1-4):");
                    int kategori = input.nextInt();

                    if (kategori >= 1 && kategori <= 4) {
                        daftarBuku.add(new Buku(judul, pengarang, kategori));
                        System.out.println("Buku telah ditambahkan.");
                    } else {
                        System.out.println("Kategori buku tidak valid.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku buku : daftarBuku) {
                        System.out.println("Judul: " + buku.judul);
                        System.out.println("Pengarang: " + buku.pengarang);
                        System.out.println("Kategori: " + getKategoriNama(buku.kategori));
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Selamat tinggal.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static String getKategoriNama(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            case 4:
                return "Lainnya";
            default:
                return "Tidak Valid";
        }
    }
}

