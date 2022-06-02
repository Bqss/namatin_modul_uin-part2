package delapan;

public class Laptop extends  Komputer{
    @Override
    public void tekan_enter() {
        System.out.println("Keyboard Laptop : Tekan Enter...");
    }

    @Override
    void hidupkan_os() {
        System.out.println("OS Laptop : dihidupkan...");
    }

    @Override
    void matikan_os() {
        System.out.println("OS Laptop : dimatikan...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse Laptop : Klik Kanan...");
    }

    @Override
    public void kllik_kiri() {
        System.out.println("Mouse Laptop : Klik Kiri...");
    }


    @Override
    public void cetak_data() {
        System.out.println("Printer Laptop : Cetak data...");
    }
}
