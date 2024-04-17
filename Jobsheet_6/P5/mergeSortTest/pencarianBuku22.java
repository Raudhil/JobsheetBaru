package Jobsheet_6.P5.mergeSortTest;

public class pencarianBuku22 {
    buku22 listBk[] = new buku22[5];
    int idx;

    void tambah(buku22 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (buku22 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            } else {
                posisi = -1;
            }

        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t: " + x);
            System.out.println("Judul\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t: " + listBk[pos].stock);
        } else if(pos == -2){
            System.out.println("Data lebih dari 1");
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public buku22 findBuku(String x) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(x)) {
                return listBk[i];
            }
        }
        return null;
    }

    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (Integer.parseInt(listBk[mid].kodeBuku) == cari) {
                return mid;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) < cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int findJudulSeq(String cari) {
        int posisi = -1;
        int hitung = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                hitung++;
            }
        }
        if (hitung == 1) {
            return posisi;
        } else {
            System.out.println("Input buku dengan Kode yang sama Lebih dari 1!");
            return -2;
        }
    }

    public int findJudulBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (Integer.parseInt(listBk[mid].kodeBuku) == Integer.parseInt(cari)) {
                if (mid >= 0 && mid < listBk.length - 1) {
                    if (listBk[mid].judulBuku.equals(listBk[mid + 1].judulBuku)) {
                        System.out.println("Input buku dengan Kode yang sama Lebih dari 1!");
                        return -2;
                    }
                }
                if (mid > 0 && mid <= listBk.length - 1) {
                    if (listBk[mid].judulBuku.equals(listBk[mid - 1].judulBuku)) {
                        System.out.println("Input buku dengan Kode yang sama Lebih dari 1!");
                        return -2;
                    }
                } else {
                    return mid;
                }
                
            } else if (Integer.parseInt(listBk[mid].kodeBuku) < Integer.parseInt(cari)) {
                return findJudulBinarySearch(cari, left, mid - 1);
            } else {
                return findJudulBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void sort() {
        buku22 tmp = new buku22();
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (Integer.parseInt(listBk[j].kodeBuku) > Integer.parseInt(listBk[j - 1].kodeBuku)) {
                    tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;

                }
            }
        }
    }

}
