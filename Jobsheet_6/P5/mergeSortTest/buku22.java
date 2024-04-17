package Jobsheet_6.P5.mergeSortTest;

public class buku22 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public buku22(String kodeBuku,String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public buku22(){
        
    }


    public void tampilDataBuku(){
        System.out.println("================================");
        System.out.println("Kode buku: " + kodeBuku);
        System.out.println("Judulu buku: " + judulBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}
