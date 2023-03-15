import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>> HITUNG LUAS SEGITIGA <<<<<");
        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = input.nextDouble();

        Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
        Segitiga<Integer> luasTipeInt = new Segitiga<>((int)alas, (int)tinggi);

        System.out.println("mau menampilkan luas dalam bentuk ? : \n 1. hasil to integer \n 2. hasil to double");
        System.out.print("masukkan pilihan 1 / 2: ");
        System.out.print("masukkan pilihan 1 / 2: ");
        int opsi = input.nextInt();
        if (opsi == 1) {
            System.out.println("Luas Segitiga Dalam Interger : " + luasTipeInt.getResultAsInt());
        } else if (opsi == 2) {
            System.out.println("Luas Segitiga Dalam Double : " + luasTipeDouble.getResultAsDouble());
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}