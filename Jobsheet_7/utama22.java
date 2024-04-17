package Jobsheet_7;

import java.util.Scanner;

public class utama22 {
    public static void main(String[] args) {
        gudang22 gudang = new gudang22(7);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan nama kategori");
                    String kategori = sc.nextLine();
                    barang22 barangBaru = new barang22(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid silahkan coba lagi.");
                    break;
            }
        }

    }
}
