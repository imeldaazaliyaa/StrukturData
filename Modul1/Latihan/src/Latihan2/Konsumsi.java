package Latihan2;

public class Konsumsi <M extends Hidangan, I extends Hidangan>{ //hanya objek dari kelas Hidangan sebagai parameter tipe
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}
