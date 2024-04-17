package Jobsheet_6.P5.mergeSortTest;

public class mergeSortMain22 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        mergeSorting22 mSort = new mergeSorting22();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
