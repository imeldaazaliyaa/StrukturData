import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("kuda");
        hewan.add("Kucing");
        hewan.add("ikan");
        hewan.add("burung");
        hewan.add("cicak");
        hewan.add("harimaau");
        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        hewan.remove(1);
        hewan.remove(1);
        hewan.remove(1);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kucing");
        deleteHewan.add("ikan");
        deleteHewan.add("burung");

        System.out.println("hewan yang dihapus");
        System.out.println(deleteHewan);

        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}