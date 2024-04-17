package Jobsheet_6.P5.mergeSortTest;

import java.util.Scanner;

public class bukuMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        pencarianBuku22 data = new pencarianBuku22();
        int jumBuku = 5;

        System.out.println("-------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = sc.next();
            System.out.print("Judul buku \t: ");
            String judulBuku = sc2.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc2.nextLine();
            System.out.print("Stock \t: ");
            int stock = sc.nextInt();

            buku22 m = new buku22(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
            
        }

        data.sort();

        System.out.println("-------------------------------------------------");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        String cari = sc.next();

        // System.out.println("Menggunakan sequential Search");
        // int posisi = data.findSeqSearch(Integer.parseInt(cari));
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
        // System.out.println("================================");
        // buku22 dataBuku = data.findBuku(cari);
        // if (dataBuku == null) {
        //     System.out.println("Kode Buku Tidak Tersedia");
        // } else{
        //     dataBuku.tampilDataBuku();
        // }

        // System.out.println();
        // System.out.println("================================");
        // System.out.println("Menggunakan binary Search");
        // posisi = data.findBinarySearch(Integer.parseInt(cari), 0, jumBuku - 1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        System.out.println("Menggunakan sequential Search");
        int posisi = data.findJudulSeq(cari);
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan");
        } else if(posisi == -2){
            System.out.println("Data duplikat");
        } else{
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
        System.out.println("================================");
        
        System.out.println();

        System.out.println("================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.findJudulBinarySearch(cari, 0, jumBuku - 1);
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan");
        } else if(posisi == -2){
            System.out.println("Data duplikat");
        } else{
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
    }
}

