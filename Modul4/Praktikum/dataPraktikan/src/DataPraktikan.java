import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataPraktikan {
    private HashMap<String, String> tabelData;
    private HashMap<String, String> tabelSesiLogin;
    static DataPraktikan dataPraktikan = new DataPraktikan();
    static String username;
    static String password;

    public DataPraktikan() {
        tabelData = new HashMap<>();
        tabelSesiLogin = new HashMap<>();
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.startsWith("IF") && !tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("NIM tidak valid atau sudah terdaftar");
        }
        return false;
    }

    public void tampil() {
        if (tabelData.isEmpty()) {
            System.out.println("Belum Ada Data yang diinputkan");
        }
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            System.out.println("NIM : " + entry.getKey() + "\nAsisten : " + entry.getValue());
        }
    }

    public void listNimPraktikan() {
        System.out.println("Daftar NIM praktikan:");
        for (String nim : tabelData.keySet()) {
            System.out.println(nim);
        }
    }

    public void listNamaAsisten() {
        System.out.println("Daftar nama asisten:");
        for (String nama : tabelData.values()) {
            System.out.println(nama);
        }
    }

    public void totalData() {
        System.out.println("Total data: " + tabelData.size());
    }

    public void hapusData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.get(nimPraktikan).equals(namaAsisten)) {
            tabelData.remove(nimPraktikan);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data gagal dihapus.");
        }
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("NIM tidak terdaftar");
        }
    }

    public void login(String username, String password) {
        dataPraktikan.tabelSesiLogin.put("imelda", "111");
        if (username.contains("@umm.ac.id")) {
            String[] split = username.split("@");
            username = split[0];

            if (dataPraktikan.tabelSesiLogin.containsKey(username) && dataPraktikan.tabelSesiLogin.get(username).equals(password)) {
                dataPraktikan.tampilMenu();
            } else {
                System.out.println("Username atau password anda tidak benar");
                main(null);
            }
        } else {
            System.out.println("Domain anda bukan @umm.ac.id");
            main(null);
        }
    }

    public void logout() {
        System.out.println("Anda Berhasil Logout");
    }

    public void tampilMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Daftar NIM praktikan");
            System.out.println("4. Daftar nama asisten");
            System.out.println("5. Total data");
            System.out.println("6. Hapus data");
            System.out.println("7. Ubah data");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM praktikan : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan nama asisten : ");
                    String nama = scanner.nextLine();
                    dataPraktikan.tambahData(nim, nama);
                    break;
                case 2:
                    dataPraktikan.tampil();
                    break;
                case 3:
                    dataPraktikan.listNimPraktikan();
                    break;
                case 4:
                    dataPraktikan.listNamaAsisten();
                    break;
                case 5:
                    dataPraktikan.totalData();
                    break;
                case 6:
                    System.out.print("Masukkan NIM praktikan yang ingin dihapus  : ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan nama asisten: ");
                    nama = scanner.nextLine();
                    dataPraktikan.hapusData(nim, nama);
                    break;
                case 7:
                    System.out.println("Masukkan NIM praktikan yang ingin diedit : ");
                    nim = scanner.nextLine();
                    System.out.println("Masukkan nama asisten baru : ");
                    nama = scanner.nextLine();
                    dataPraktikan.editData(nim, nama);
                    break;
                case 0:
                    dataPraktikan.logout();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println();
        } while (menu != 0);

    }

    public static void main(String[] args) {
        DataPraktikan data = new DataPraktikan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== DATA PRAKTIKAN ======");
        System.out.println("Pastikan Login Terlebih Dahulu");
        System.out.print("Masukkan Email : ");
        username = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        password = scanner.nextLine();
        data.login(username,password);
    }
}
