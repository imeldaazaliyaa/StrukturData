package Kegiatan2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //implementasi LinkedList, menambahkan Node
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(8);
        System.out.print("Before : ");
        list.showData(list.head); //menampilkan data sebelum diurutkan dengan method showData

        System.out.println(" ");

        list.Sort(list.head); //mengurutkan data dengan mengambil method sort
        System.out.print("After  : ");
        list.showData(list.head);
    }
}
