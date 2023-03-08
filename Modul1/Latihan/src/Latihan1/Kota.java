package Latihan1;

public class Kota<E>{
    private E element;

    public Kota(E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Latihan1.Kota di Jawa Timur : " + jumlahKota.getElement() + " Latihan1.Kota");
        System.out.println("Salah satu kota di Jawa Timur : Latihan1.Kota "+ namaKota.getElement());
    }
}
