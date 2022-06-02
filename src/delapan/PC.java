package delapan;

public class PC extends  Komputer {

    @Override
    public void tekan_enter() {
        System.out.println("Keyboard PC : Tekan Enter...");
    }

    @Override
    void hidupkan_os() {
        System.out.println("OS PC : dihidupkan...");
    }

    @Override
    void matikan_os() {
        System.out.println("OS PC : dimatikan...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse PC : Klik Kanan...");
    }

    @Override
    public void kllik_kiri() {
        System.out.println("Mouse PC : Klik Kiri...");
    }


    @Override
    public void cetak_data() {
        System.out.println("Printer PC : Cetak data...");
    }
}
