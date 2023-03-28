package Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Implementasi ArrayList of String ===\n");

        // 1. membuat object kosong ArrayList of String
        List<String> hewan = new ArrayList<>();

        // 2. menambahkan elemen dan menampilkan jumlah dan posisi index
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");
        hewan.add("Badak");
        hewan.add("Bebek");
        System.out.println(hewan);
        int count = 0;
        List<Integer> indexBebek = new ArrayList<>();
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                count++;
                indexBebek.add(i);
            }
        }
        System.out.println("Bebek = " + count);
        System.out.println("Posisi Index = " + indexBebek);
        System.out.println("--------------------------------------------------------");

        // 3. menghapus posisi "Bebek" yang pertama
        hewan.remove("Bebek");
        System.out.println(hewan);
        System.out.println("--------------------------------------------------------");


        // 4. menampilkan dan menghapus elemen pada index ke-0 dan ke-2
        System.out.println("Index ke-0 = " + hewan.get(0));
        System.out.println("Index ke-2 = " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);
        System.out.println("--------------------------------------------------------");


        // 5. mengubah dan menambahkan elemen baru pada index ke-0 dan ke-2
        hewan.set(0, "Ular");
        System.out.println(hewan);
        hewan.add(2, "Itik");
        System.out.println(hewan);
        System.out.println("--------------------------------------------------------");


        // 6. menghapus elemen dari index ke-1 hingga ke-5
        hewan.subList(2, 5).clear();
        System.out.println(hewan);
        System.out.println("--------------------------------------------------------");


        // 7. menampilkan elemen pertama dan terakhir
        System.out.println("Elemen Pertama = " + hewan.get(0));
        System.out.println("Elemen Terakhir = " + hewan.get(hewan.size() - 1));
        System.out.println("--------------------------------------------------------");


        // 8. menampilkan jumlah elemen pada ArrayList
        System.out.println("Jumlah elemen = " + hewan.size());
        System.out.println("--------------------------------------------------------");


        // 9. mencari posisi index dari "Badak"
        int posisi = hewan.indexOf("Badak");
        System.out.println("Posisi index Badak = " + posisi);
    }
}
